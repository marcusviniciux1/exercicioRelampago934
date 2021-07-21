public class Empresa {
    private Grupo grupo;
    private Funcionario diretor;

    Empresa(Funcionario diretor, Grupo grupo){
        this.diretor = diretor;
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return this.diretor;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }
}