package transport;

public abstract class transport {
    private  String brand;
    private  String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
    }

    public abstract void refill();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank() || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = "default";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <=0 ) {
            maxSpeed =0;
        }
        this.maxSpeed = maxSpeed;
    }
}
