public class Biblioteca {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pepe", "1234", true);
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.nuevoUsuarioAdmin(usuario1);
        Usuario usuario2 = new Usuario("Juan", "5678", false);
        gestor.nuevoUsuarioNormal(usuario2);
    }

}
