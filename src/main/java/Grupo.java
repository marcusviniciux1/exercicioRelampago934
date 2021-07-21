public class Grupo {
    private Pais sede;
    private Funcionario presidente;

    Grupo(Funcionario presidente, Pais sede){
        if(presidente == null)
            throw new NullPointerException("Presidente não informado");

        if(sede == null)
            throw new NullPointerException("Pais sede não informado");

        this.presidente = presidente;
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return this.presidente;
    }

    public Pais getSede() {
        return sede;
    }
}