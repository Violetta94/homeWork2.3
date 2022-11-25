package transport;

import java.util.regex.Pattern;
public class Car extends Transport {
    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatCount;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = 0;
        this.transmission = null;
        this.bodyType = null;
        this.registrationNumber = null;
        this.seatCount = 0;
    }

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, float engineVolume, String transmission, String bodyType, String registrationNumber, int seatCount) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.seatCount = seatCount;
    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " можно заправлять бензином, дизелем на заправке или заряжать на " +
                "специальных электропарковках, если это электрокар.");
    }

    public void prez() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear()  + "года выпуска. Сборка в " + getCountry() + ", " + getColor() + " цвета. Объем двигателя - " + getEngineVolume() + " л.");
    }

    public String validateRegistrationNumber (String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", registrationNumber)) {
            return registrationNumber;
        } else  {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <=0) {
            engineVolume=1.5f;
        }
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            transmission = "default";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            registrationNumber = "default";
        }
        this.registrationNumber = registrationNumber;
    }

    public int getSeatCount() {
        return seatCount;
    }
}
