package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan plat nomer Anda: ");
        String plat = scanner.nextLine();
        scanner.close();
        STNK stnk;
        // MASUKKAN KODE ANDA DI SINI
        String regex = "[\\s*]";
        String[] iniPlat = plat.split(regex);
        stnk = new STNK(name, iniPlat[0]);

        // JANGAN DIPRINT MANUAL! PRINT AJA PAKAI FUNGSI
        // DI BAWAH INI:
        printSTNK(stnk);
    }

    /*
    * Fungsi di bawah ini (printMahasiswa())
    * JANGAN DIUBAH - UBAH, ANDA HANYA PERLU MERUBAH main() FUNCTION ATAU
    * KELAS Mahasiswa
     */
    public static void printSTNK (STNK stnk) {
        System.out.println("Nama\t\t: " + stnk.getPemilik());
        System.out.println("Kode Plat\t: " + stnk.getKodePlat());
        System.out.println("Lokasi\t\t: " + stnk.getLokasi());
    }
}
