package animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeFood;

    public Herbivores(String name, String environment, String typeFood) {
        super(name, environment);
        this.typeFood = typeFood;
    }

    public Herbivores(String name, String environment, int speed, String typeFood) {
        super(name, environment, speed);
        this.typeFood = typeFood;
    }

    public Herbivores(String name, int age, String environment, int speed, String typeFood) {
        super(name, age, environment, speed);
        this.typeFood = typeFood;
    }

    @Override
    public void sleep() {
        System.out.println("я сплю ночью");
    }

    @Override
    public void go() {
        System.out.println("я передвигаюсь");
    }

    @Override
    public void eat() {
        System.out.println("я ем травку");
    }

    @Override
    public void walk() {
        System.out.println("я гуляю ");
    }

    public void graze() {
        System.out.println("пойду пастись");
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
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public String toString() {
        return "Травоядное - " + getName() + ", возраст - " + getAge() +
                ", среда обитания - " + getEnvironment() + ", скорость - " + getSpeed() +
                ", питается -" + getTypeFood() + '\'' +
                '.';
    }
}
