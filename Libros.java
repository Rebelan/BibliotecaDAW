// Esta clase contiene un array con todos los libros de la biblioteca

public class Libros {
   private Libro[] libros;
   private int numLibros;
   private static final int tam = 10;

   public Libros() {
      this.libros = new Libro[tam];
      this.numLibros = 0;
   }

   public void nuevoLibro(Libro libro) {
    libros[numLibros] = libro;
    numLibros++;
   }
}
