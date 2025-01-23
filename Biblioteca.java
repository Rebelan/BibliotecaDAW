import java.util.Scanner;

public class Biblioteca {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pepe", "1234", true);
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.nuevoUsuario(usuario1);
        Usuario usuario2 = new Usuario("Juan", "5678", true);
        gestor.nuevoUsuario(usuario2);
        Libros libros = new Libros();

        boolean flag = true;
        // Login de la biblioteca

        while (flag) {
            System.out.println("Introduce una opción");
            menuVisualAdmin();
            int op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Introduce el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Introduce el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.println("Introduce la categoría del libro: ");
                    String categoria = sc.nextLine();
                    Libro libro = new Libro(titulo, autor, categoria, true);
                    libros.nuevoLibro(libro);
                    break;
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
                case 6:
                    gestor.ConsultarInformacionUsuarios();
                    break;
                case 7:
                    libros.ConsultarInformacionLibros();
                    break;
                case 8:
                    System.out.println("Introduce el título del libro: ");
                    String tituloBuscar = sc.nextLine();
                    Libro libroEncontrado = libros.buscarLibro(tituloBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("El libro encontrado es: ");
                        System.out.println("-------------");
                        System.out.println("Título: " + libroEncontrado.getTitulo());
                        System.out.println("Autor: " + libroEncontrado.getAutor());
                        System.out.println("Categoría: " + libroEncontrado.getCategoria());
                        System.out.println("Disponible: " + libroEncontrado.getDisponible());
                        System.out.println("-------------");
                    } else {
                        System.out.println("No se ha encontrado el libro");
                    }
                    break;
                case 9:
                    System.out.println("Introduce el autor del libro: ");
                    String autorBuscar = sc.nextLine();
                    Libro[] librosAutor = libros.buscarPorAutor(autorBuscar);
                    if (librosAutor.length > 0) {
                        System.out.println("Los libros encontrados son: ");
                        for (int i = 0; i < librosAutor.length; i++) {
                            System.out.println("-------------");
                            System.out.println("Título: " + librosAutor[i].getTitulo());
                            System.out.println("Autor: " + librosAutor[i].getAutor());
                            System.out.println("Categoría: " + librosAutor[i].getCategoria());
                            System.out.println("Disponible: " + librosAutor[i].getDisponible());
                            System.out.println("-------------");
                        }
                    } else {
                        System.out.println("No se han encontrado libros");
                    }
                    break;
                case 10:
                    System.out.println("Introduce la categoría del libro: ");
                    String categoriaBuscar = sc.nextLine();
                    Libro[] librosCategoria = libros.buscarPorCategoria(categoriaBuscar);
                    if (librosCategoria.length > 0) {
                        System.out.println("Los libros encontrados son: ");
                        for (int i = 0; i < librosCategoria.length; i++) {
                            System.out.println("-------------");
                            System.out.println("Título: " + librosCategoria[i].getTitulo());
                            System.out.println("Autor: " + librosCategoria[i].getAutor());
                            System.out.println("Categoría: " + librosCategoria[i].getCategoria());
                            System.out.println("Disponible: " + librosCategoria[i].getDisponible());
                            System.out.println("-------------");
                        }
                    } else {
                        System.out.println("No se han encontrado libros");
                    }
                    break;
                case 11:
                    flag = false;
                    break;
            }
        }

    }

    public static void menuVisualAdmin() {
        System.out.println("1. Añadir un libro");
        System.out.println("2. Eliminar un libro");
        System.out.println("3. Añadir un usuario");
        System.out.println("4. Pedir un libro");
        System.out.println("5. Devolver un libro");
        System.out.println("6. Consultar información de los usuarios");
        System.out.println("7. Consultar información de los libros");
        System.out.println("8. Buscar un libro por titulo");
        System.out.println("9. Buscar libros por autor");
        System.out.println("10. Buscar un libro por categoria");
        System.out.println("11. Salir");

    }

    public static void menuVisualUsuario() {
        System.out.println("1. Consultar libros disponibles");
        System.out.println("2. Pedir prestado un libro");
        System.out.println("3. Devolver un libro");
        System.out.println("4. Salir");

    }

    public static void AñadirLibro() {

    }
}
