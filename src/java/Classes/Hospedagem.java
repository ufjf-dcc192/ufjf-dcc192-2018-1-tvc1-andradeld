package Classes;


public class Hospedagem {
    private int codigo;
    private int cod_usuario;
    private String localizacao;
    private boolean disponivel = true;

    public Hospedagem(int cod_usuario, String localizacao) {
        this.cod_usuario = cod_usuario;
        this.localizacao = localizacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
}
