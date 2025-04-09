package org.example;


public class STNK {
    private String namaPemilik;
    private String Kodeplat;
    private String lokasi;

    public STNK(String name, String plat){
        namaPemilik = name;
        Kodeplat = plat;

        if(Kodeplat.equals("BE")){
            lokasi = "Lampung";
        }
        else if(Kodeplat.equals("AB")){
            lokasi = "Jogja";
        }
        else if(Kodeplat.equals("D")){
            lokasi = "Bandung";
        }
        else if(Kodeplat.equals("B")){
            lokasi = "Jakarta";
        }
    }
    public String getPemilik(){
        return namaPemilik;
    }

    public String getKodePlat(){
        return Kodeplat;
    }

    public String getLokasi(){
        return lokasi;
    }
}
