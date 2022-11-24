package animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String environment;
    private int speed;

    public Mammals(String name, String environment) {
        super(name);
        this.environment = environment;
    }

    public Mammals(String name, String environment, int speed) {
        super(name);
        this.environment = environment;
        this.speed = speed;
    }

    public Mammals(String name, int age, String environment, int speed) {
        super(name, age);
        this.environment = environment;
        this.speed = speed;
    }

    @Override
    public void go() {
        System.out.println("я гуляю в зоопарке");
    }

    @Override
    public void eat() {
        System.out.println("я ем всё");
    }

    @Override
    public void sleep() {
        System.out.println("я сплю ночью и днём");
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
        Mammals that = (Mammals) o;
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
