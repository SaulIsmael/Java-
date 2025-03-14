import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm() {
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }


    private void validar(){
        //Leer los valores
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());
        if ("root".equals(usuario) && "admin".equals(password))
            mostrarMensaje("Datos correctos, bienvenido!");
        else if ("root".equals(usuario))
            mostrarMensaje("Password incorrecto, corregirlo!");
        else
            mostrarMensaje("Usuario incorrecto, corregirlo!");

    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * Método para inicializar componentes personalizados.
     * Este método se ejecuta si marcaste componentes como "Custom Create" en el archivo .form.
     */
    private void createUIComponents() {
        // Inicialización de componentes personalizados:

        // Ejemplo de JTextField personalizado
        usuarioTexto = new JTextField();
        usuarioTexto.setColumns(20); // Establece el ancho del campo de texto

        // Ejemplo de JPasswordField personalizado
        passwordTexto = new JPasswordField();
        passwordTexto.setEchoChar('*'); // Configura el carácter de enmascaramiento

        // Ejemplo de JButton personalizado
        enviarBoton = new JButton("Enviar");
        enviarBoton.addActionListener(e -> {
            // Lógica del botón
            String usuario = usuarioTexto.getText();
            String password = new String(passwordTexto.getPassword());
            JOptionPane.showMessageDialog(this,
                    "Usuario: " + usuario + "\nContraseña: " + password,
                    "Credenciales",
                    JOptionPane.INFORMATION_MESSAGE);
        });
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Cambiar el look and feel a modo oscuro
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
