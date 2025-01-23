public class GestorPrestamos {
    private Libro[] prestados;  
    private int indice;


    public GestorPrestamos() {
        this.prestados = new Libro[20];
        this.indice = 0;
    }


    public void realizarPrestamo(Libro prestado){
        prestados[indice] = prestado;
        indice++;  
        System.out.println("El préstamo se ha realizado correctamente"); 
    }

    public void devolverLibro(String titulo){
        
        
        
    }


}
