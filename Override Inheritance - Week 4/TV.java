package org.example;

public class TV {
    private int maxResolusi;
    private int resolution;
    Colokan colokan;

    public int getResolution(){
        int max = 0;
        double bw = colokan.getRealBandwidth();
        if(bw >= 10 && bw <= 35){
            max = 480;
        }
        else if(bw >= 35 && bw <= 100){
            max = 720;
        }
        else{
           max = 1080;
        }
        return Math.min(max,this.maxResolusi);
    }

    public TV(int maxResolusi){
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
}
