package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth(){
        if(getHarga() < 30000){
            double hitung = (double) getHarga() / (double)30000;
            return getPromisedBandwidth() * hitung;
        }
        return getPromisedBandwidth();
    }
}
