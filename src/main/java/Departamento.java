public class Departamento {
    private Empresa empresa;
    private Funcionario chefia;

    Departamento(Empresa empresa, Funcionario chefia){
        if(empresa == null)
            throw new NullPointerException("Empresa não informada");

        if(chefia == null)
            throw new NullPointerException("Chefia não informada");

        this.empresa = empresa;
        this.chefia = chefia;
    }

    public Funcionario getChefia() {
        return this.chefia;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }
}