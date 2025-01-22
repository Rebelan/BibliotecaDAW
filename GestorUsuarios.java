
public class GestorUsuarios {
    private Usuario[] usuarios;
    private int numUsuarios;

    public GestorUsuarios() {
        this.usuarios = new Usuario[20];
        this.numUsuarios = 0;
    }

    public void nuevoUsuario(Usuario usuario) {
        usuarios[numUsuarios] = usuario;
        numUsuarios++;
    }

    public void ConsultarInformacionUsuarios() {
        System.out.println("Los usuarios de la biblioteca son: ");
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("Nombre: " + usuarios[i].getNomUsuario());
            System.out.println("Contraseña: " + usuarios[i].getPasswd());
            System.out.println("Es administrador: " + usuarios[i].getAdmin());
            System.out.println("-------------");
        }
    }

}
