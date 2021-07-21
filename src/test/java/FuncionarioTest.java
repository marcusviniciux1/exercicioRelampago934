import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarEstadoAlocacaoFuncionario(){
        Pais pais = new Pais("Brasil");

        Escolaridade escolaridadePresidente = new Escolaridade("Pos Doutorado");
        Funcionario presidente = new Funcionario("Vinícius",escolaridadePresidente);
        Grupo grupo = new Grupo(presidente, pais);

        Empresa empresa = new Empresa(presidente, grupo);

        Escolaridade escolaridadeChefia = new Escolaridade("Ensino medio");
        Funcionario chefia = new Funcionario("Nicolas", escolaridadeChefia);
        Departamento departamento = new Departamento(empresa, chefia);

        Escolaridade escolaridadeFuncionario = new Escolaridade("Ensino Fundamental");
        Funcionario funcionario = new Funcionario("Rodrigo", escolaridadeFuncionario);
        funcionario.setAlocacao(departamento);

        assertEquals("Brasil", funcionario.getAlocacao().getEmpresa().getGrupo().getSede().getNomePais());
    }


    @Test
    void deveRetornarEstadoFilialCoordenadaPorFuncionario(){
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("Rio de Janeiro", pais);
        Cidade cidade = new Cidade("Carmo", estado);

        Escolaridade escolaridade = new Escolaridade("Pos Doutorado");
        Funcionario presidente = new Funcionario("Marcus", escolaridade);
        Grupo grupo = new Grupo(presidente, pais);

        Funcionario diretor = presidente;
        Empresa empresa = new Empresa(diretor, grupo);

        Escolaridade escolaridadeFuncionario = new Escolaridade("Ensino Medio");
        Funcionario coordenador = new Funcionario("João", escolaridadeFuncionario);

        Filial filial = new Filial(empresa,cidade);

        coordenador.setCoordenacao(filial);

        assertEquals("Brasil", coordenador.getCoordenacao().getCidade().getEstado().getPais().getNomePais());
    }


    @Test
    void deveRetornarErroDepartamentoNãoInformado(){
        try {
            Escolaridade escolaridade = new Escolaridade("Ensino medio");
            Funcionario funcionario = new Funcionario("Marcus", escolaridade);
            funcionario.setAlocacao(null);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Alocação não informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroFilialNãoInformada(){
        try {
            Escolaridade escolaridade = new Escolaridade("Ensino medio");
            Funcionario funcionario = new Funcionario("Vinícius", escolaridade);
            funcionario.setCoordenacao(null);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Filial não informado", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroStringNãoInformada(){
        try{
            Escolaridade escolaridade = new Escolaridade("Ensino Medio");
            Funcionario funcionario = new Funcionario(null, escolaridade);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Nome não informado", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroEscolaridadeNãoInformada(){
        try{
            Funcionario funcionario = new Funcionario("Marcus", null);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Escolaridade não informada", e.getMessage());
        }
    }
}