package QuizPBO;
public abstract class Konten {
    protected String idKonten;
    protected String tipeKonten;

    public Konten(String idKonten, String tipeKonten) {
        this.idKonten = idKonten;
        this.tipeKonten = tipeKonten;
    }

    public abstract void tampilkanKonten();
}