package animals;

import java.util.Objects;

public class Flying extends Birds {
    private String movement;

    public Flying(String name, String environment, String movement) {
        super(name, environment);
        this.movement = movement;
    }

    public Flying(String name, int age, String environment, String movement) {
        super(name, age, environment);
        this.movement = movement;
    }

    @Override
    public void eat() {
        System.out.println("я ем");
    }

    @Override
    public void go() {
        System.out.println("я могу передвигаться с помощью полета");
    }

    @Override
    public void sleep() {
        System.out.println("я сплю");
    }

    @Override
    public void hunt() {
        System.out.println("я нападаю");
    }

    public void fly(){
        System.out.println("я лечу");
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
        Flying that = (Flying) o;
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
