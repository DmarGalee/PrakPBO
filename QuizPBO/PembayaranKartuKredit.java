package QuizPBO;
public class PembayaranKartuKredit extends Pembayaran {
    private String nomorKartu;
    private String cvv;

    public PembayaranKartuKredit(String idPembayaran, double jumlah, String tanggal, String nomorKartu, String cvv) {
        super(idPembayaran, jumlah, tanggal);
        this.nomorKartu = nomorKartu;
        this.cvv = cvv;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran dengan kartu kredit.");
    }
}
