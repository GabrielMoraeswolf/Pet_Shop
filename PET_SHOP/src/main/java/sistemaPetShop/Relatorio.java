package sistemaPetShop;

public class Relatorio {
    
    private String laudo;

    public Relatorio(String laudo) {
        this.laudo = laudo;
    }

    public boolean setLaudo(String laudo) {
        this.laudo = laudo;
        return true;
    }

    public String getLaudo() {
        return laudo;
    }
}
