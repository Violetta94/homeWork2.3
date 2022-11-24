package transport;

public class Train extends transport {

    private int costTrip;
    private int timeTrip;
    private String nameStation;
    private String terminalStation;
    private int quantityStation;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        this.costTrip = 0;
        this.timeTrip = 0;
        this.nameStation = null;
        this.terminalStation = null;
        this.quantityStation = 0;
    }

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, int costTrip, int timeTrip, String nameStation, String terminalStation, int quantityStation) {
        super(brand, model, year, country, color, maxSpeed);
        this.costTrip = costTrip;
        this.timeTrip = timeTrip;
        this.nameStation = nameStation;
        this.terminalStation = terminalStation;
        this.quantityStation = quantityStation;
    }

    public void refill() {
        System.out.println(getBrand() + " нужно заправлять дизелем.");
    }
    public  void poezd () {

        System.out.println("Поезд «" + getBrand() + "», модель " + getModel() + ", " + getYear() + " год выпуска в " +
                getCountry() + ", скорость передвижения — " + getMaxSpeed() + " км/ч, отходит от " +
                getNameStation() + " и следует до станции " + getTerminalStation() + ". Цена поездки — " + getCostTrip() +
                " рублей, в поезде " + getQuantityStation() + " вагонов.");
    }

    public int getCostTrip() {
        return costTrip;
    }

    public void setCostTrip(int costTrip) {
        if (costTrip<0) {
            costTrip = 0;
        }
        this.costTrip = costTrip;
    }

    public float getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        if (timeTrip<0) {
            timeTrip = 0;
        }
        this.timeTrip = timeTrip;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        if (nameStation == null || nameStation.isBlank() || nameStation.isEmpty()) {
            nameStation = "default";
        }
        this.nameStation = nameStation;
    }

    public String getTerminalStation() {
        return terminalStation;
    }

    public void setTerminalStation(String terminalStation) {
        if (terminalStation == null || terminalStation.isBlank() || terminalStation.isEmpty()) {
            terminalStation = "default";
        }
        this.terminalStation = terminalStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        if (quantityStation<0) {
            quantityStation = 1;
        }
        this.quantityStation = quantityStation;
    }
}
