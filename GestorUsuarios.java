import java.util.Scanner;

public class GestorUsuarios {
    private Usuario[] usuarios;
    private int numUsuarios;
    

    public static Scanner sc = new Scanner(System.in);

    public GestorUsuarios() {
        this.usuarios = new Usuario[20];
        this.numUsuarios = 0;
    }

    public void nuevoUsuarioAdmin(Usuario usuario) {
        if (usuario.getAdmin() == true) {
            System.out.println("Introduce el nombre del administrador");
            String nombre = sc.nextLine();
            System.out.println("Introduce la contraseña del administrador");
            String passwd = sc.nextLine();
            Usuario usuarioN = new Usuario(nombre,passwd,true);
            usuarios[numUsuarios] = usuarioN;
        numUsuarios++;
        System.out.println("Usuario añadido correctamente");
        }else{
            System.out.println("No tienes permisos para añadir un usuario");
        }
        
    }
    public void nuevoUsuarioNormal(Usuario usuario) {
        if (usuario.getAdmin() == true) {
            System.out.println("Introduce el nombre del usuario");
            String nombre = sc.nextLine();
            System.out.println("Introduce la contraseña del usuario");
            String passwd = sc.nextLine();
            Usuario usuarioNormal = new Usuario(nombre,passwd,false);
            usuarios[numUsuarios] = usuarioNormal;
        numUsuarios++;
        }else{
            System.out.println("No tienes permisos para añadir un usuario");
        }
        
    }
    

}
