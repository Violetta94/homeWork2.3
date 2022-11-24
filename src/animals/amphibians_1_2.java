package animals;

import java.util.Objects;

public class amphibians_1_2 extends animals_1 {
    private String environment;

    public amphibians_1_2(String name, String environment) {
        super(name);
        this.environment = environment;
    }

    public amphibians_1_2(String name, int age, String environment) {
        super(name, age);
        this.environment = environment;
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

    public void hunt() {

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
        amphibians_1_2 that = (amphibians_1_2) o;
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
