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

   public void LibrosDisponibles() {
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

   public void OrderPorPrestamos() {
      for (int i = 0; i < numLibros - 1; i++) {
         for (int j = i + 1; j < numLibros; j++) {
            if (libros[i].getNumPrestado() < libros[j].getNumPrestado()) {
               Libro aux = libros[i];
               libros[i] = libros[j];
               libros[j] = aux;
            }
         }
      }
      for (int i = 0; i < numLibros; i++) {
         System.out.println("Título: " + libros[i].getTitulo() + " Número de veces prestado: " + libros[i].getNumPrestado());
      }
   }
}
