package org.ukdw.data;

public class Gedung {
    private int id;
    private String nama;
    private String alamat;
    // test

    // Constructor
    public Gedung(int id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Override toString untuk debugging
    @Override
    public String toString() {
        return "Gedung{id=" + id + ", nama='" + nama + "', alamat='" + alamat + "'}";
    }
}
