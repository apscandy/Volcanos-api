package com.andyslabs.volcano.api_server.model.volcano.data;

public class VolcanoPopulationData extends VolcanoDetails{
    private int population5Km;

    private int population10Km;

    private int population30Km;

    private int population100Km;

    public VolcanoDetails toVolcanoDetails() {
        VolcanoDetails volcanoDetails = new VolcanoDetails();
        volcanoDetails.setId(this.getId());
        volcanoDetails.setCountry(this.getCountry());
        volcanoDetails.setRegion(this.getRegion());
        volcanoDetails.setSubregion(this.getSubregion());
        volcanoDetails.setElevation(this.getElevation());
        volcanoDetails.setLatitude(this.getLatitude());
        volcanoDetails.setLongitude(this.getLongitude());
        volcanoDetails.setSummit(this.getSummit());
        volcanoDetails.setLastEruption(this.getLastEruption());
        return volcanoDetails;
    }

    public int getPopulation5Km() {
        return population5Km;
    }

    public void setPopulation5Km(int population5Km) {
        this.population5Km = population5Km;
    }

    public int getPopulation10Km() {
        return population10Km;
    }

    public void setPopulation10Km(int population10Km) {
        this.population10Km = population10Km;
    }

    public int getPopulation30Km() {
        return population30Km;
    }

    public void setPopulation30Km(int population30Km) {
        this.population30Km = population30Km;
    }

    public int getPopulation100Km() {
        return population100Km;
    }

    public void setPopulation100Km(int population100Km) {
        this.population100Km = population100Km;
    }

}
