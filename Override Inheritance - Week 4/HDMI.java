package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth(){
        if(getHarga() < 50000){
            double hitung = (double) getHarga() / (double)50000;
            return getPromisedBandwidth() * hitung;
        }
        return getPromisedBandwidth();
    }
}
