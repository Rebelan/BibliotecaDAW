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

    public void devolverPrestamo(String titulo){
        int i = 0;
        boolean encontrado = false;
        while (i < indice && !encontrado) {
            if (prestados[i].getTitulo().equals(titulo)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            for (int j = i; j < indice - 1; j++) {
                prestados[j] = prestados[j + 1];
            }
            indice--;
            System.out.println("El libro se ha devuelto correctamente");
        } else {
            System.out.println("El libro no se ha encontrado");
        }
        
        
    }


}
