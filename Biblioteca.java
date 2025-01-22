public class Biblioteca {
    private String nomBiblio;
    private Libro[] libros;
    private Usuario[] usuarios;

    public Biblioteca() {
        this.nomBiblio = "Biblioteca";
        this.libros = new Libro[10];
        this.usuarios = new Usuario[10];
    }

    public Biblioteca(String nomBiblio) {
        this();
        this.nomBiblio = nomBiblio;
    }

}
