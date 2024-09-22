package QuizPBO;
public class Peserta {
    private String idPeserta;
    private String namaPeserta;
    private String email;

    public Peserta(String idPeserta, String namaPeserta, String email) {
        this.idPeserta = idPeserta;
        this.namaPeserta = namaPeserta;
        this.email = email;
    }

    public void ambilKursus(Kursus kursus) {
        System.out.println("Peserta " + namaPeserta + " mendaftar pada kursus " + kursus.getNamaKursus());
    }

    public String getIdPeserta() { return idPeserta; }
    public void setIdPeserta(String idPeserta) { this.idPeserta = idPeserta; }
    public String getNamaPeserta() { return namaPeserta; }
    public void setNamaPeserta(String namaPeserta) { this.namaPeserta = namaPeserta; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
