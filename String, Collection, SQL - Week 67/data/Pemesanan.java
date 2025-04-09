package org.ukdw.data;

public class Pemesanan {
    private int id;
    private int idRuangan;
    private String userEmail;
    private String checkOutTime;
    private String checkOutDate;
    private String checkinTime;
    private String checkinDate;

    public Pemesanan(int id, String userEmail, int idRuangan, String checkinDate, String checkOutDate, String checkinTime, String checkOutTime) {
        this.checkOutTime = checkOutTime;
        this.id = id;
        this.userEmail = userEmail;
        this.checkOutDate = checkOutDate;
        this.checkinTime = checkinTime;
        this.idRuangan = idRuangan;
        this.checkinDate = checkinDate;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getcheckOutDate() {
        return checkOutDate;
    }

    public void setcheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public int getIdRuangan() {
        return idRuangan;
    }

    public void setIdRuangan(int idRuangan) {
        this.idRuangan = idRuangan;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }
}