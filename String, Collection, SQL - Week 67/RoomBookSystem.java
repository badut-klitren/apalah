package org.ukdw;

import java.util.List;
import java.util.Scanner;

public class RoomBookSystem {

    public RoomBookSystem() {
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di System pemesanan ruangan UKDW");
            System.out.println("0. Exit");

            System.out.print("Silahkan menentukan pilihan: ");
            int choice = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 0:
                    exitApps();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void exitApps() {
        System.out.println("Keluar aplikasi. Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) {
        RoomBookSystem roomBookSystem = new RoomBookSystem();
        DBConnectionManager.createTables();
        roomBookSystem.start();
    }

    public void addPemesanan(Scanner scanner) {
        
    }
}
