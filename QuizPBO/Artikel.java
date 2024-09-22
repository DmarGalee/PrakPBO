package QuizPBO;
public class Artikel extends Konten {
    private int panjang; // panjang artikel dalam kata

    public Artikel(String idKonten, String tipeKonten, int panjang) {
        super(idKonten, tipeKonten);
        this.panjang = panjang;
    }

    @Override
    public void tampilkanKonten() {
        System.out.println("Menampilkan artikel dengan panjang " + panjang + " kata.");
    }
}