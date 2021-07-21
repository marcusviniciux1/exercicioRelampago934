public class Funcionario {
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;
    private String nome;

    Funcionario(String nome, Escolaridade escolaridade){
        if(nome == null)
            throw new NullPointerException("Nome não informado");

        if(escolaridade == null)
            throw new NullPointerException("Escolaridade não informada");


        this.nome = nome;
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return this.nome;
    }

    Escolaridade getEscolaridade(){
        return this.escolaridade;
    }

    public void setAlocacao(Departamento alocacao) {
        if(alocacao == null)
            throw new NullPointerException("Alocação não informada");

        this.alocacao = alocacao;
    }

    public Departamento getAlocacao() {
        return this.alocacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        if(coordenacao == null)
            throw new NullPointerException("Filial não informado");
        this.coordenacao = coordenacao;
    }

    public Filial getCoordenacao() {
        return this.coordenacao;
    }
}