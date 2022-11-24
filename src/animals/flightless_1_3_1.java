package animals;

import java.util.Objects;

public class flightless_1_3_1 extends birds_1_3{
    private String movement;

    public flightless_1_3_1(String name, String environment, String movement) {
        super(name, environment);
        this.movement = movement;
    }

    public flightless_1_3_1(String name, int age, String environment, String movement) {
        super(name, age, environment);
        this.movement = movement;
    }

    public void eat() {
    }

    @Override
    public void go() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void hunt() {

    }

    public void walk() {

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
        flightless_1_3_1 that = (flightless_1_3_1) o;
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