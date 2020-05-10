package dale;

public class Peca {
    private String nomeEspecifico;

    public void setNomeEspecifico(String nomeEspecifico) {
        this.nomeEspecifico = nomeEspecifico;
    }
    private String estado;
    private boolean status;
    private int quantidade;
    private String foto;
    private final String idPeca;
    private String tipo;

    public Peca(String nomeEspecifico, String estado, boolean status, int quantidade, String foto, String idPeca, String tipo) {
        this.nomeEspecifico = nomeEspecifico;
        this.estado = estado;
        this.status = status;
        this.quantidade = quantidade;
        this.foto = foto;
        this.idPeca = idPeca;
        this.tipo = tipo;
    }

    public String getNomeEspecifico(){
        return nomeEspecifico;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean  status) {
        this.status = status;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getIdPeca() {
        return idPeca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Peca{" + "nomeEspecifico=" + nomeEspecifico + ", estado=" + estado + ", status=" + status + ", quantidade=" + quantidade + ", foto=" + foto + ", idPeca=" + idPeca + ", tipo=" + tipo + '}';
    }
    
    



}
