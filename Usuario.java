// Esta clase contiene las características del usuario, así como los libros que tiene en propiedad

public class Usuario{
    private String nomUsuario;
    private String passwd;
    private boolean admin;
    private Libro[] prestados= new Libro[5];

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


    public Usuario() {
        this.nomUsuario = "";
        this.passwd = "";
        this.admin = false;
    }


    public Usuario(String nomUsuario, String passwd, boolean admin) {
        this.nomUsuario = nomUsuario;
        this.passwd = passwd;
        this.admin = admin;
    }
}