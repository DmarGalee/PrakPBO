package QuizPBO;
public class PembayaranEWallet extends Pembayaran {
    private String idWallet;

    public PembayaranEWallet(String idPembayaran, double jumlah, String tanggal, String idWallet) {
        super(idPembayaran, jumlah, tanggal);
        this.idWallet = idWallet;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran dengan e-wallet.");
    }
}
