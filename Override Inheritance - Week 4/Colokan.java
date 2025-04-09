package org.example;

public abstract class Colokan {
    private String merk;
    private double promisedBandwidth;
    private int harga;

    public String getMerk() {
        return merk;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public int getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Colokan(int harga, double promisedBandwidth, String merk) {
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
        this.merk = merk;
    }

    public abstract double getRealBandwidth();
}
