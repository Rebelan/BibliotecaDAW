// Esta clase contiene las características del usuario, así como los libros que tiene en propiedad

public class Usuario{
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
    public boolean getAdmin(){
        return this.admin;
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
}