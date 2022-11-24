package animals;

import java.util.Objects;

public abstract class mammals_1_1 extends animals_1 {
    private String environment;
    private int speed;

    public mammals_1_1(String name, String environment) {
        super(name);
        this.environment = environment;
    }

    public mammals_1_1(String name, String environment, int speed) {
        super(name);
        this.environment = environment;
        this.speed = speed;
    }

    public mammals_1_1(String name, int age, String environment, int speed) {
        super(name, age);
        this.environment = environment;
        this.speed = speed;
    }

    @Override
    public void go() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    public abstract void walk();

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if (environment == null || environment.isEmpty() || environment.isBlank()) {
            this.environment = "default";
        }
        this.environment = environment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0 ) {
            this.speed = 0;
        }
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        mammals_1_1 that = (mammals_1_1) o;
        return speed == that.speed && Objects.equals(environment, that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment, speed);
    }

    @Override
    public String toString() {
        return "mammals_1_1{" +
                "environment='" + environment + '\'' +
                ", speed=" + speed +
                '}';
    }
}
