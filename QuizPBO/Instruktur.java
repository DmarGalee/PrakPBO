package QuizPBO;
public class Instruktur {
    private String idInstruktur;
    private String namaInstruktur;

    public Instruktur(String idInstruktur, String namaInstruktur) {
        this.idInstruktur = idInstruktur;
        this.namaInstruktur = namaInstruktur;
    }

    public void buatKonten(Konten konten) {
        System.out.println("Instruktur " + namaInstruktur + " membuat konten.");
    }

    public String getIdInstruktur() { return idInstruktur; }
    public void setIdInstruktur(String idInstruktur) { this.idInstruktur = idInstruktur; }
    public String getNamaInstruktur() { return namaInstruktur; }
    public void setNamaInstruktur(String namaInstruktur) { this.namaInstruktur = namaInstruktur; }
}