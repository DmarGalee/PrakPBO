package QuizPBO;
public abstract class Pembayaran {
    protected String idPembayaran;
    protected double jumlah;
    protected String tanggal;

    public Pembayaran(String idPembayaran, double jumlah, String tanggal) {
        this.idPembayaran = idPembayaran;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    public abstract void prosesPembayaran();
}
