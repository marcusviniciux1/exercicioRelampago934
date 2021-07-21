public class Estado {
    private Pais pais;
    private String unidadeFederativa;

    Estado(String unidadeFederativa, Pais pais){
        this.unidadeFederativa = unidadeFederativa;
        this.pais = pais;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public Pais getPais() {
        return this.pais;
    }
}