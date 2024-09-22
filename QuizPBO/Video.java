package QuizPBO;
public class Video extends Konten {
        private int durasi; // durasi dalam berapa menit
    
        public Video(String idKonten, String tipeKonten, int durasi) {
            super(idKonten, tipeKonten);
            this.durasi = durasi;
        }
    
        @Override
        public void tampilkanKonten() {
            System.out.println("Menampilkan video dengan durasi " + durasi + " menit.");
        }
    }