public class Combo {
    private String sanduiche;
    private String batataFrita;
    private String refrigerante;
    private String salada;

    public Combo(){
        this.setSanduiche("");
        this.setBatataFrita("");
        this.setRefrigerante("");
        this.setSalada("");
    }

    public Combo(String sanduiche, String batataFrita, String refrigerante, String salada) {
        this.setSanduiche(sanduiche);
        this.setBatataFrita(batataFrita);
        this.setRefrigerante(refrigerante);
        this.setSalada(salada);
    }


    public String getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
    }

    public String getBatataFrita() {
        return batataFrita;
    }

    public void setBatataFrita(String batataFrita) {
        this.batataFrita = batataFrita;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }
}

