package QuizPBO;
import java.util.ArrayList;
import java.util.List;
public class Kursus {
    private String idKursus;
    private String namaKursus;
    private String deskripsi;
    private List<Konten> daftarKonten;
    private List<Peserta> daftarPeserta;

    public Kursus(String idKursus, String namaKursus, String deskripsi) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.deskripsi = deskripsi;
        this.daftarKonten = new ArrayList<>();
    }

    public void addKonten(Konten konten) {
        daftarKonten.add(konten);
    }

    public List<Konten> getDaftarKonten() {
        return daftarKonten;
    }

    public String getIdKursus() {
        return idKursus;
    }

    public void setIdKursus(String idKursus) {
        this.idKursus = idKursus;
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public void setNamaKursus(String namaKursus) {
        this.namaKursus = namaKursus;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}