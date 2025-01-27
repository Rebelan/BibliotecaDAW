// Esta clase contiene las características del usuario, así como los libros que tiene en propiedad
/*
 * @author: Abel Constantino Muñoz y Alexander Plantón Jarmolowicz
 */
public class Usuario {
    private String nomUsuario;
    private String passwd;
    private boolean admin;
    private Libro[] prestados;
    private int numPrestados;

    public String getNomUsuario() {
        return this.nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public boolean getAdmin() {
        return this.admin;
    }

    public int getNumPrestados() {
        return this.numPrestados;
    }

    public Usuario() {
        this.nomUsuario = "";
        this.passwd = "";
        this.admin = false;
        this.prestados = new Libro[10];
        this.numPrestados = 0;
    }

    public Usuario(String nomUsuario, String passwd, boolean admin) {
        this();
        this.nomUsuario = nomUsuario;
        this.passwd = passwd;
        this.admin = admin;
    }

    public void TomarPrestado(Libro libro) {
        prestados[numPrestados] = libro;
        numPrestados++;
    }

    public void DevolverLibro(String titulo) {
        int i = 0;
        boolean encontrado = false;
        while (i < numPrestados && !encontrado) {
            if (prestados[i].getTitulo().equals(titulo)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            for (int j = i; j < numPrestados - 1; j++) {
                prestados[j] = prestados[j + 1];
            }
            numPrestados--;
        } else {
            System.out.println("No se ha encontrado el libro");
        }
    }
}