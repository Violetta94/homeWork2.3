package animals;

import java.util.Objects;

public class Flightless extends Birds {
    private String movement;

    public Flightless(String name, String environment, String movement) {
        super(name, environment);
        this.movement = movement;
    }

    public Flightless(String name, int age, String environment, String movement) {
        super(name, age, environment);
        this.movement = movement;
    }

    public void eat() {
        System.out.println("я питаюсь");
    }

    @Override
    public void go() {
        System.out.println("я иду");
    }

    @Override
    public void sleep() {
        System.out.println("я сплю");
    }

    @Override
    public void hunt() {
        System.out.println("я охочусь");
    }

    public void walk() {
        System.out.println("я гуляю");
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        if (movement == null || movement.isBlank() || movement.isEmpty()) {
            this.movement = "default";
        }
        this.movement = movement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movement, that.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movement);
    }

    @Override
    public String
    toString() {
        return "Нелетающие - " + getName() + ", возраст - " + getAge() +
                ", среда обитания - " + getEnvironment() + ", тип передвижения - " + getMovement() + '.';
    }
}