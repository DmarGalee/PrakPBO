package QuizPBO;
public class Kuis extends Konten {
    private int jumlahSoal;

    public Kuis(String idKonten, String tipeKonten, int jumlahSoal) {
        super(idKonten, tipeKonten);
        this.jumlahSoal = jumlahSoal;
    }

    @Override
    public void tampilkanKonten() {
        System.out.println("Menampilkan kuis dengan " + jumlahSoal + " soal.");
    }
}
