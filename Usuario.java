
public class Usuario{
    private String nomUsuario;
    private String passwd;
    private Libro[] prestado = new Libro[5];


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
    }


    public Usuario(String nomUsuario, String passwd){
        this.nomUsuario = nomUsuario;
        this.passwd = passwd;
    }
}