package com.andyslabs.volcano.api_server.model.volcano.data;

public class VolcanoDetails extends Volcano {

    private String lastEruption;

    private int summit;

    private int elevation;

    private String latitude;

    private String longitude;

    public Volcano toVolcano() {
        Volcano volcano = new Volcano();
        volcano.setId(this.getId());
        volcano.setCountry(this.getCountry());
        volcano.setRegion(this.getRegion());
        volcano.setSubregion(this.getSubregion());
        return volcano;
    }

    public String getLastEruption() {
        return lastEruption;
    }

    public void setLastEruption(String lastEruption) {
        this.lastEruption = lastEruption;
    }

    public int getSummit() {
        return summit;
    }

    public void setSummit(int summit) {
        this.summit = summit;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


}
