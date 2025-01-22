import java.util.Scanner;

public class Biblioteca {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pepe", "1234", true);
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.nuevoUsuario(usuario1);
        Usuario usuario2 = new Usuario("Juan", "5678", true);
        gestor.nuevoUsuario(usuario2);

        boolean flag = true;
        while (flag) {
            System.out.println("Introduce una opción");
            menuVisual();
            int op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 3:
                    System.out.println("Introduce el nombre del usuario: ");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce la contraseña: ");
                    String passwd = sc.nextLine();
                    System.out.println("¿Es administrador? (s/n)");
                    String admin = sc.nextLine();
                    boolean esAdmin = false;
                    if (admin.equals("s")) {
                        esAdmin = true;
                    }
                    Usuario usuario = new Usuario(nombre, passwd, esAdmin);
                    gestor.nuevoUsuario(usuario);
                    break;
                case 7:
                    gestor.ConsultarInformacionUsuarios();
                    break;
                case 9:
                    flag = false;
                    break;
            }
        }

    }

    public static void menuVisual() {
        System.out.println("1. Añadir un libro");
        System.out.println("2. Eliminar un libro");
        System.out.println("3. Añadir un usuario");
        System.out.println("4. Eliminar un usuario");
        System.out.println("5. Prestar un libro");
        System.out.println("6. Devolver un libro");
        System.out.println("7. Consultar información de los usuarios");
        System.out.println("8. Consultar información de los libros");
        System.out.println("9. Salir");

    }
}
