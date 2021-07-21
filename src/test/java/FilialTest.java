import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarNomeDiretorEmpresaFilial(){
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("Rio de Janeiro", pais);
        Cidade cidade = new Cidade("Carmo", estado);

        Escolaridade escolaridade = new Escolaridade("Pos Doutorado");
        Funcionario presidente = new Funcionario("Marcus", escolaridade);
        Grupo grupo = new Grupo(presidente, pais);

        Funcionario diretor = presidente;
        Empresa empresa = new Empresa(diretor, grupo);

        Filial filial = new Filial(empresa, cidade);

        assertEquals("Marcus", filial.getEmpresa().getDiretor().getNome());
    }

    @Test
    void deveRetornarErroEmpresaNãoInformada(){

        try{
            Pais pais = new Pais("Brasil");
            Estado estado = new Estado("Rio de Janeiro", pais);
            Cidade cidade = new Cidade("Carmo", estado);

            Escolaridade escolaridade = new Escolaridade("Pos Doutorado");
            Funcionario presidente = new Funcionario("Vinícius", escolaridade);

            Funcionario diretor = presidente;

            Filial filial = new Filial(null, cidade);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Empresa não informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroCidadeNãoInformada() {

        try {
            Pais pais = new Pais("Brasil");
            Estado estado = new Estado("Rio de Janeiro", pais);
            Cidade cidade = new Cidade("Carmo", estado);

            Escolaridade escolaridade = new Escolaridade("Pos Doutorado");
            Funcionario presidente = new Funcionario("Marcus", escolaridade);
            Grupo grupo = new Grupo(presidente, pais);

            Funcionario diretor = presidente;
            Empresa empresa = new Empresa(diretor, grupo);

            Filial filial = new Filial(empresa, null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Cidade não informada", e.getMessage());
        }
    }
}