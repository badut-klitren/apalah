package org.example.coba;

public class Samsak {
    private int dayaTahan;
    private int tingkatKekerasan;
    private boolean rusak = false;

    public Samsak(int dayaTahan, int tingkatKekerasan){
        setDayaTahan(dayaTahan);
        setTingkatKekerasan(tingkatKekerasan);
        getTingkatKekerasan();
    }

    public void setDayaTahan(int dayaTahan) {
        this.dayaTahan = dayaTahan;
    }

    public void setTingkatKekerasan(int tingkatKekerasan) {
        this.tingkatKekerasan = tingkatKekerasan;
    }

    public void setRusak(boolean rusak) {
        this.rusak = rusak;
    }

    public int getDayaTahan() {
        return dayaTahan;
    }

    public int getTingkatKekerasan() {
        return tingkatKekerasan;
    }

    public boolean isRusak() {
        if(dayaTahan <= 0){
            return rusak = true;
        }
        else{
            return rusak;
        }
    }
}
