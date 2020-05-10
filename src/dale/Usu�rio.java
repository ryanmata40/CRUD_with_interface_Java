
package dale;


public class Usuário {
    private String nome;
    private String email;
    private final String IdUsuario;
    private String endereco;
    private String Contato;
    private int porntos;


    public Usuário(String nome, String email, String IdUsuario, String Contato, int porntos, String endereco) {
        this.nome = nome;
        this.email = email;
        this.IdUsuario = IdUsuario;
        this.Contato = Contato;
        this.porntos = porntos;
        this.endereco=endereco;
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    public int getPorntos() {
        return porntos;
    }

    public void setPorntos(int porntos) {
        this.porntos = porntos;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + "\n email=" + email + "\n IdUsuario=" + IdUsuario + "\n Contato=" + Contato + "\n porntos=" + porntos ;
    }
    
    
}
