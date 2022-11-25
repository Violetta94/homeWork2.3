package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String environment;

    public Amphibians(String name, String environment) {
        super(name);
        this.environment = environment;
    }

    public Amphibians(String name, int age, String environment) {
        super(name, age);
        this.environment = environment;
    }
    @Override
    public void eat() {
        System.out.println("я ем");
    }

    @Override
    public void go() {
        System.out.println("я передвигаюсь");
    }

    @Override
    public void sleep() {
        System.out.println("я сплю");
    }

    public void hunt() {
        System.out.println("я охочусь");
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if (environment == null || environment.isEmpty() || environment.isBlank()) {
            this.environment = "default";
        }
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(environment, that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment);
    }

    @Override
    public String toString() {
        return "Земноводное - " + getName() + ", возраст - " + getAge()+
                ", среда обитания - " + getEnvironment() +
                '.';
    }
}
