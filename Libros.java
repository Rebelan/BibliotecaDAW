// Esta clase es la gestora de la clase libro, y contiene un array de libros y un contador de libros

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
