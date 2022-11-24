package transport;

public class Bus  extends transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

        public void busPrez () {
            System.out.println( "Автобус " + getBrand() + " модели " + getModel() + ", "
                    + getYear() +" года выпуска, страна производства - " + getCountry() + ", " +
                    getColor() + " цвета, максимальная скорость - " + getMaxSpeed());
        }
    public void refill() {
        System.out.println(getBrand() + " можно заправлять бензином или дизелем.");
    }
}
