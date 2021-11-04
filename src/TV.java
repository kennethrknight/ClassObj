public class TV {
    private String brand = "LG";
    private int sizeInches = 43;
    private String backlightTechnology = "OLED";


    public TV(String brand, int sizeInches, String backlightTechnology) {
        this.brand = brand;
        this.sizeInches = sizeInches;
        this.backlightTechnology = backlightTechnology;
    }
    
    public TV(String brand, String backlightTechnology) {
        this.brand = brand;
        this.backlightTechnology = backlightTechnology;
    }

    public TV() {
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSizeInches() {
        return this.sizeInches;
    }

    public void setSizeInches(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    public String getBacklightTechnology() {
        return this.backlightTechnology;
    }

    public void setBacklightTechnology(String backlightTechnology) {
        this.backlightTechnology = backlightTechnology;
    }

    public boolean isLargeScreen() {
        if (sizeInches > 65) {
            return true;
        }
        else {
            return false;
        }
    }
}