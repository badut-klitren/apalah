package org.example.coba;

public class Petinju {
    private String name;
    private int Stamina;
    private int kekuatan;

    public Petinju(String nama, int kekuatan){
        String regex = ("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String[] pisah = nama.split(regex);
        int x = Integer.parseInt(pisah[1]);
        setName(pisah[0]);
        setStamina(x);
        setKekuatan(kekuatan);
    }

    public void tinju(Samsak samsak){
        if(getStamina() > 0){
            if(getKekuatan() > samsak.getTingkatKekerasan()){
                int dayaTahan = samsak.getDayaTahan() - getKekuatan();
                samsak.setDayaTahan(dayaTahan);
                int staminaSisa = getStamina() - getKekuatan();
                setStamina(staminaSisa);

                System.out.println("Daya tahan samsak berkurang : "+getKekuatan());
                System.out.println("Stamina petinju "+getName()+" tersisa : "+getStamina());

                if(samsak.getDayaTahan() <= 0){
                    boolean status = false;
                    samsak.setRusak(status);
                    System.out.println("Samsak Hancur!");
                }
                else{
                    System.out.println("Daya tahan samsak tersisa : "+samsak.getDayaTahan());
                }
            }
            else{
                System.out.println("Samsak terlalu keras bagi "+getName()+" sang petinju!");

            }
        }
        else{
            System.out.println("Stamina petinju "+getName()+" sudah habis!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStamina(int stamina) {
        Stamina = stamina;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return Stamina;
    }

    public int getKekuatan() {
        return kekuatan;
    }
}
