package animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String typeFood;

    public Predators(String name, String environment, String typeFood) {
        super(name, environment);
        this.typeFood = typeFood;
    }

    public Predators(String name, String environment, int speed, String typeFood) {
        super(name, environment, speed);
        this.typeFood = typeFood;
    }

    public Predators(String name, int age, String environment, int speed, String typeFood) {
        super(name, age, environment, speed);
        this.typeFood = typeFood;
    }

    @Override
    public void sleep() {
        System.out.println("я сплю");
    }

    @Override
    public void go() {
        System.out.println("я гуляю");
    }

    @Override
    public void eat() {
        System.out.println("я ем мясо");
    }

    @Override
    public void walk() {
        System.out.println("я гуляю на природе");
    }

    public void hunt() {
        System.out.println("я охочусь на дичь");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public final void setTypeFood(String typeFood) {
        if (typeFood == null || typeFood.isBlank() || typeFood.isBlank()) {
            this.typeFood = "default";
        }
        this.typeFood = typeFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators that = (Predators) o;
        return Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public String toString() {
        return "Хищник - " + getName() + ", возраст - " + getAge() +
                ", среда обитания - " + getEnvironment() + ", скорость - " + getSpeed() +
                ", питается -" + getTypeFood() + '\'' +
                '.';
    }
}
