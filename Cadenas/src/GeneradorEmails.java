public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");
        // Nombre completo del usuario
        var nombreCompleto = " Saul Ismael Mansilla ";
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Procesar o normalizar el nombre del usuario
        // Limpiar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        // Reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        // Convertimos a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // Datos de la empresa
        var nombreEmpresa = " Gamers Master ";
        System.out.println("\nNombre Empresa = " + nombreEmpresa);
        var extensionDominio = ".com.ar";
        System.out.println("ExtensionDominio = " + extensionDominio);

        // Quitamos los espacios en blanco y convertimos a minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        // Creamos el email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
    }

}
