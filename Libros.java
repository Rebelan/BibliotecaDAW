// Esta clase es la gestora de la clase libro, y contiene un array de libros y un contador de libros

import java.util.Arrays;

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

   private int buscarIdLibro(String titulo) {
      int buscar = -1;
      for (int i = 0; i < numLibros && buscar == -1; i++) {
         if (libros[i].getTitulo().equals(titulo)) {
            buscar = i;
         }
      }
      return buscar;
   }

   public Libro buscarLibro(String titulo) {
      Libro buscar = null;
      int indice = buscarIdLibro(titulo);
      if (indice != -1) {
         buscar = libros[indice];
      }
      return buscar;

   }

   public Libro[] buscarPorAutor(String autor) {
      Libro[] resultado = new Libro[tam];
      int autorLleno = 0;
      for (int i = 0; i < numLibros; i++) {
         if (libros[i].getAutor().equals(autor)) {
            resultado[autorLleno] = libros[i];
            autorLleno++;
         }
      }
      return Arrays.copyOf(resultado, autorLleno);
   }

   public Libro[] buscarPorCategoria(String categoria) {
      Libro[] resultado = new Libro[tam];
      int catLlena = 0;
      for (int i = 0; i < numLibros; i++) {
         if (libros[i].getCategoria().equals(categoria)) {
            resultado[catLlena] = libros[i];
            catLlena++;
         }
      }
      return Arrays.copyOf(resultado, catLlena);
   }

   public boolean eliminarLibro(String titulo) {
      int indice = buscarIdLibro(titulo);
      if (indice != -1) {
         for (int i = indice; i < numLibros - 1; i++) {
            libros[i] = libros[i + 1];
         }
         libros[--numLibros] = null;
         return true;
      } else {
         return false;
      }
   }

   public void ConsultarInformacionLibros() {
      System.out.println("Los libros de la biblioteca son: ");
      for (int i = 0; i < numLibros; i++) {
         System.out.println("Título: " + libros[i].getTitulo());
         System.out.println("Autor: " + libros[i].getAutor());
         System.out.println("Categoría: " + libros[i].getCategoria());
         System.out.println("Disponible: " + libros[i].getDisponible());
         System.out.println("-------------");
      }
   }
   public void prestarLibro(Libro libro) {
      libro.setDisponible(false);
      libro.setNumPrestado(libro.getNumPrestado() + 1);
   }
   public void devolverLibro(Libro libro) {
      libro.setDisponible(true);
   }
   public void LibrosDisponibles(){
      System.out.println("Los libros disponibles son: ");
      for (int i = 0; i < numLibros; i++) {
         if (libros[i].getDisponible()) {
            System.out.println("----------------");
            System.out.println("Título: " + libros[i].getTitulo());
            System.out.println("Autor: " + libros[i].getAutor());
            System.out.println("Categoría: " + libros[i].getCategoria());
            System.out.println("----------------");
         }
      }
   }

   public void masPrestados() {
      int m1 = 0;
      int m2 = 0;
      int m3 = 0;

      Libro l1 = new Libro();
      Libro l2 = new Libro();
      Libro l3 = new Libro();

      for (int i = 0; i < libros.length; i++) {
         if (libros[i].getNumPrestado() > m1) {
            m1 = libros[i].getNumPrestado();
            l1 = libros[i];
         } else if (libros[i].getNumPrestado() > m2) {
            m2 = libros[i].getNumPrestado();
            l2 = libros[i];
         } else if (libros[i].getNumPrestado() > m3) {
            m3 = libros[i].getNumPrestado();
            l3 = libros[i];
         }

      }

      System.out.println("Los tres libros más prestados son: ");
      for (int i = 0; i < libros.length; i++) {
         if (l1.getTitulo().equals(libros[i].getTitulo()) || l2.getTitulo().equals(libros[i].getTitulo())
               || l3.getTitulo().equals(libros[i].getTitulo())) {
            System.out.println("Título: " + libros[i].getTitulo());
            System.out.println("Autor: " + libros[i].getAutor());
            System.out.println("Categoría: " + libros[i].getCategoria());
            System.out.println("-------------");
         }
      }

   }
   
}
