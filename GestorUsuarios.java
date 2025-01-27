
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

    public void UsuarioConMasPrestamos(){
        int maxPrestamos = 0;
        Usuario userMax = new Usuario();
        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].getNumPrestados() >= maxPrestamos) {
                maxPrestamos = usuarios[i].getNumPrestados();
                userMax = usuarios[i];
            }
        }
        System.out.println("El usuario con más préstamos es: " + userMax.getNomUsuario() + " con " + maxPrestamos + " préstamos");
    }

   public Usuario buscarUsuario(String nombre, String passwd){
        Usuario userBuscar = null;
        boolean encontrado = false;
        for (int i = 0; i < numUsuarios; i++) {
            if (usuarios[i].getNomUsuario().equals(nombre) && usuarios[i].getPasswd().equals(passwd)) {
                userBuscar = usuarios[i];
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Bienvenido " + userBuscar.getNomUsuario());
        }else{
            System.out.println("Usuario/contraseña incorrectos o no existente");
        }
        return userBuscar;
   }

    

}
