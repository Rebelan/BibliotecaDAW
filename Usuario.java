
public class Usuario{
    private String nomUsuario;
    private String passwd;



    public Usuario() {
        this.nomUsuario = "";
        this.passwd = "";
    }


    public Usuario(String nomUsuario, String passwd){
        this.nomUsuario = nomUsuario;
        this.passwd = passwd;
    }
}