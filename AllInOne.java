import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

// Class & Object
class Mahasiswa {
    String nama;
    int nim;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Encapsulation
class MahasiswaEncapsulated {
    private String nama;
    private int nim;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }
}

// Inheritance
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    void bersuara() {
        System.out.println("Meong...");
    }
}

// Polymorphism (Override)
class Kendaraan {
    void berjalan() {
        System.out.println("Kendaraan berjalan...");
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil berjalan dengan roda empat...");
    }
}

// Abstraction
abstract class AbstractKendaraan {
    abstract void berjalan();
}

class Motor extends AbstractKendaraan {
    void berjalan() {
        System.out.println("Motor berjalan dengan dua roda...");
    }
}

// Method Overloading
class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}

// Composition
class Mesin {
    void hidupkan() {
        System.out.println("Mesin dihidupkan...");
    }
}

class MobilKomposisi {
    private Mesin mesin = new Mesin();

    void nyalakanMobil() {
        mesin.hidupkan();
        System.out.println("Mobil siap berjalan...");
    }
}

// Output Formatting & Validasi Input & Logging
public class Main {
    public static void catatLog(String pesan) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(LocalDateTime.now() + " - " + pesan + "\n");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam pencatatan log.");
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Budi";
        mhs.nim = 123456;
        mhs.tampilkanInfo();

        MahasiswaEncapsulated mhsEncap = new MahasiswaEncapsulated();
        mhsEncap.setNama("Ani");
        mhsEncap.setNim(654321);
        System.out.println("Nama: " + mhsEncap.getNama());
        System.out.println("NIM: " + mhsEncap.getNim());

        Kucing kucing = new Kucing();
        kucing.bersuara();

        Kendaraan kendaraan = new Mobil();
        kendaraan.berjalan();

        Motor motor = new Motor();
        motor.berjalan();

        Kalkulator k = new Kalkulator();
        System.out.println(k.tambah(5, 10));
        System.out.println(k.tambah(5.5, 10.5));

        MobilKomposisi mobil = new MobilKomposisi();
        mobil.nyalakanMobil();

        Scanner scanner = new Scanner(System.in);
        int usia;

        while (true) {
            System.out.print("Masukkan usia: ");
            if (scanner.hasNextInt()) {
                usia = scanner.nextInt();
                if (usia > 0) break;
            }
            scanner.nextLine();
            System.out.println("Input tidak valid. Coba lagi.");
        }
        System.out.printf("Nama: %s, Umur: %d tahun%n", "Budi", usia);
        catatLog("Aplikasi dimulai.");
    }
}