package Classes;


public class Usuario {
    private int cod_usuario;
    private String nome;
    private boolean brasileiro;

    public Usuario(String nome, boolean brasileiro) {
        this.nome = nome;
        this.brasileiro = brasileiro;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isBrasileiro() {
        return brasileiro;
    }

    public void setBrasileiro(boolean brasileiro) {
        this.brasileiro = brasileiro;
    }
       
}
