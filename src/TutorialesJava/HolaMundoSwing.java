package TutorialesJava;



import javax.swing.*;        

public class HolaMundoSwing {
    /**
     * Crear la GUI y mostarla. Para seguridad de hilos,
     * este método debería invocarse desde el hilo de
     * despachado de eventos.
     */
    private static void crearYmostrarGUI() {
        //Asegurarse de que tenemos bonitas decoraciones de ventana.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Crear y configurar la ventana.
        JFrame frame = new JFrame("HolaMundoSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Agregar la ubicua viñeta "Hola Mundo".
        JLabel label = new JLabel("Hola Mundo");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Desplegar la ventana.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Programar un trabajo para el hilo despachador de eventos:
        //creando y mostrando la GUI de la aplicación.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearYmostrarGUI();
            }
        });
    }
}