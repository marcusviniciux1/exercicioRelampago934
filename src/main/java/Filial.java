public class Filial {
    private Empresa empresa;
    private Cidade cidade;

    Filial(Empresa empresa, Cidade cidade){
        if(empresa == null)
            throw new NullPointerException("Empresa não informada");

        if(cidade == null)
            throw new NullPointerException("Cidade não informada");

        this.empresa = empresa;
        this.cidade = cidade;

    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public Cidade getCidade() {
        return cidade;
    }
}