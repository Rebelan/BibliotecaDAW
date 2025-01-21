// Esta clase contiene las características de los libros

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.categoria = "";
        this.disponible = false;
    }

    public Libro(String titulo, String autor, String categoria, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

}
