package QuizPBO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Kursus> daftarKursus = new ArrayList<>();
    static List<Instruktur> daftarInstruktur = new ArrayList<>();
    static List<Peserta> daftarPeserta = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline
            switch (pilihan) {
                case 1:
                    tambahInstruktur();
                    break;
                case 2:
                    tambahPeserta();
                    break;
                case 3:
                    tambahKursus();
                    break;
                case 4:
                    tampilkanKursus();
                    break;
                case 5:
                    prosesPembayaran();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0);
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Tambah Instruktur");
        System.out.println("2. Tambah Peserta");
        System.out.println("3. Tambah Kursus");
        System.out.println("4. Tampilkan Kursus dan Konten");
        System.out.println("5. Proses Pembayaran");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void tambahInstruktur() {
        System.out.print("Masukkan ID Instruktur: ");
        String idInstruktur = scanner.nextLine();
        System.out.print("Masukkan Nama Instruktur: ");
        String namaInstruktur = scanner.nextLine();

        Instruktur instruktur = new Instruktur(idInstruktur, namaInstruktur);
        daftarInstruktur.add(instruktur);
        System.out.println("Instruktur berhasil ditambahkan.");
    }

    public static void tambahPeserta() {
        System.out.print("Masukkan ID Peserta: ");
        String idPeserta = scanner.nextLine();
        System.out.print("Masukkan Nama Peserta: ");
        String namaPeserta = scanner.nextLine();
        System.out.print("Masukkan Email Peserta: ");
        String email = scanner.nextLine();

        Peserta peserta = new Peserta(idPeserta, namaPeserta, email);
        daftarPeserta.add(peserta);
        System.out.println("Peserta berhasil ditambahkan.");
    }

    public static void tambahKursus() {
        System.out.print("Masukkan ID Kursus: ");
        String idKursus = scanner.nextLine();
        System.out.print("Masukkan Nama Kursus: ");
        String namaKursus = scanner.nextLine();
        System.out.print("Masukkan Deskripsi Kursus: ");
        String deskripsi = scanner.nextLine();

        Kursus kursus = new Kursus(idKursus, namaKursus, deskripsi);
        daftarKursus.add(kursus);
        System.out.println("Kursus berhasil ditambahkan.");

        // Tambah konten ke kursus
        String pilihan;
        do {
            System.out.print("Tambahkan konten ke kursus ini? (y/n): ");
            pilihan = scanner.nextLine();
            if (pilihan.equalsIgnoreCase("y")) {
                tambahKonten(kursus);
            }
        } while (pilihan.equalsIgnoreCase("y"));
    }

    public static void tambahKonten(Kursus kursus) {
        System.out.println("Jenis Konten: ");
        System.out.println("1. Video");
        System.out.println("2. Artikel");
        System.out.println("3. Kuis");
        System.out.print("Pilih jenis konten: ");
        int jenisKonten = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline

        System.out.print("Masukkan ID Konten: ");
        String idKonten = scanner.nextLine();
        switch (jenisKonten) {
            case 1:
                System.out.print("Masukkan durasi video (menit): ");
                int durasi = scanner.nextInt();
                Konten video = new Video(idKonten, "Video", durasi);
                kursus.addKonten(video);
                break;
            case 2:
                System.out.print("Masukkan panjang artikel (kata): ");
                int panjang = scanner.nextInt();
                Konten artikel = new Artikel(idKonten, "Artikel", panjang);
                kursus.addKonten(artikel);
                break;
            case 3:
                System.out.print("Masukkan jumlah soal kuis: ");
                int jumlahSoal = scanner.nextInt();
                Konten kuis = new Kuis(idKonten, "Kuis", jumlahSoal);
                kursus.addKonten(kuis);
                break;
            default:
                System.out.println("Jenis konten tidak valid.");
        }
        scanner.nextLine();  // Konsumsi newline
        System.out.println("Konten berhasil ditambahkan.");
    }

    public static void tampilkanKursus() {
        if (daftarKursus.isEmpty()) {
            System.out.println("Belum ada kursus yang tersedia.");
            return;
        }

        for (Kursus kursus : daftarKursus) {
            System.out.println("\nKursus: " + kursus.getNamaKursus());
            System.out.println("Deskripsi: " + kursus.getDeskripsi());
            System.out.println("Konten:");
            for (Konten konten : kursus.getDaftarKonten()) {
                konten.tampilkanKonten();
            }
        }
    }

    public static void prosesPembayaran() {
        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Kartu Kredit");
        System.out.println("2. E-Wallet");
        System.out.print("Pilih metode: ");
        int metode = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan ID Pembayaran: ");
        String idPembayaran = scanner.nextLine();
        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlah = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan tanggal pembayaran (YYYY-MM-DD): ");
        String tanggal = scanner.nextLine();

        if (metode == 1) {
            System.out.print("Masukkan nomor kartu kredit: ");
            String nomorKartu = scanner.nextLine();
            System.out.print("Masukkan CVV: ");
            String cvv = scanner.nextLine();
            Pembayaran pembayaran = new PembayaranKartuKredit(idPembayaran, jumlah, tanggal, nomorKartu, cvv);
            pembayaran.prosesPembayaran();
        } else if (metode == 2) {
            System.out.print("Masukkan ID E-Wallet: ");
            String idWallet = scanner.nextLine();
            Pembayaran pembayaran = new PembayaranEWallet(idPembayaran, jumlah, tanggal, idWallet);
            pembayaran.prosesPembayaran();
        } else {
            System.out.println("Metode pembayaran tidak valid.");
        }
    }
}
