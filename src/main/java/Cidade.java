public class Cidade {
    private String nomeCidade;
    private Estado estado;

    Cidade(String nomeCidade, Estado estado){
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public Estado getEstado() {
        return this.estado;
    }
}