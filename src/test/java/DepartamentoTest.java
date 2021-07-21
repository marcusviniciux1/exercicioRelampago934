import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarEscolaridadeChefeDepartamento(){
        Pais pais = new Pais("Brasil");

        Escolaridade escolaridadePresidente = new Escolaridade("Pos Doutorado");
        Funcionario presidente = new Funcionario("Pedro",escolaridadePresidente);
        Grupo grupo = new Grupo(presidente, pais);

        Empresa empresa = new Empresa(presidente, grupo);

        Escolaridade escolaridadeChefia = new Escolaridade("Doutorado");
        Funcionario chefia = new Funcionario("João", escolaridadeChefia);
        Departamento departamento = new Departamento(empresa, chefia);

        Escolaridade escolaridadeFuncionario = new Escolaridade("Ensino Fundamental");
        Funcionario funcionario = new Funcionario("Lucas", escolaridadeFuncionario);
        funcionario.setAlocacao(departamento);

        assertEquals("Doutorado", departamento.getChefia().getEscolaridade().getNivelEscolaridade());
    }

    @Test
    void deveRetornarErroEmpresaNãoInformada(){

        try{
            Escolaridade escolaridadeChefia = new Escolaridade("Doutorado");
            Funcionario chefia = new Funcionario("João", escolaridadeChefia);
            Departamento departamento = new Departamento(null, chefia);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Empresa não informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroChefiaNãoInformada(){
        try{
            Pais pais = new Pais("Brasil");

            Escolaridade escolaridadePresidente = new Escolaridade("Pos Doutorado");
            Funcionario presidente = new Funcionario("Pedro",escolaridadePresidente);
            Grupo grupo = new Grupo(presidente, pais);

            Empresa empresa = new Empresa(presidente, grupo);

            Departamento departamento = new Departamento(empresa, null);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Chefia não informada", e.getMessage());
        }
    }
}