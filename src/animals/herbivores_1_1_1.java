package animals;

import java.util.Objects;

public class herbivores_1_1_1 extends mammals_1_1{
    private String typeFood;

    public herbivores_1_1_1(String name, String environment, String typeFood) {
        super(name, environment);
        this.typeFood = typeFood;
    }

    public herbivores_1_1_1(String name, String environment, int speed, String typeFood) {
        super(name, environment, speed);
        this.typeFood = typeFood;
    }

    public herbivores_1_1_1(String name, int age, String environment, int speed, String typeFood) {
        super(name, age, environment, speed);
        this.typeFood = typeFood;
    }

    @Override
    public void sleep() {
    }

    @Override
    public void go() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void walk() {
    }

    public void graze() {

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
        herbivores_1_1_1 that = (herbivores_1_1_1) o;
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
