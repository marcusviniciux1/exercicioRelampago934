import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridadePresidenteGrupo(){
        Pais sede = new Pais("Brasil");

        Escolaridade escolaridadePresidente = new Escolaridade("Pos Doutorado");
        Funcionario presidente = new Funcionario("Marcus",escolaridadePresidente);
        Grupo grupo = new Grupo(presidente, sede);

        assertEquals("Pos Doutorado", grupo.getPresidente().getEscolaridade().getNivelEscolaridade());
    }

    @Test
    void deveRetornarErroPresidenteNãoInformado(){
        try{
            Pais sede = new Pais("Brasil");

            Grupo grupo = new Grupo(null, sede);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Presidente não informado", e.getMessage());
        }
    }

    @Test
    void deveRetornarErroPaisSedeNãoInformado(){
        try{
            Escolaridade escolaridadePresidente = new Escolaridade("Pos Doutorado");
            Funcionario presidente = new Funcionario("Marcus",escolaridadePresidente);
            Grupo grupo = new Grupo(presidente, null);
            fail();
        }
        catch(NullPointerException e){
            assertEquals("Pais sede não informado", e.getMessage());
        }
    }
}