package animals;

import java.util.Objects;

public class flying_1_3_2 extends birds_1_3{
    private String movement;

    public flying_1_3_2(String name, String environment, String movement) {
        super(name, environment);
        this.movement = movement;
    }

    public flying_1_3_2(String name, int age, String environment, String movement) {
        super(name, age, environment);
        this.movement = movement;
    }

    @Override
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

    public void fly(){

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
        flying_1_3_2 that = (flying_1_3_2) o;
        return Objects.equals(movement, that.movement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movement);
    }

    @Override
    public String toString() {
        return "Летающие - " + getName() + ", возраст - " + getAge() +
                ", среда обитания - " + getEnvironment() + ", тип передвижения - " + getMovement() + '.';
    }
}
