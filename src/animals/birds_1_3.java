package animals;

import java.util.Objects;

public abstract class birds_1_3 extends animals_1 {
    private String environment;

    public birds_1_3(String name, String environment) {
        super(name);
        this.environment = environment;
    }

    public birds_1_3(String name, int age, String environment) {
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

    public abstract void hunt();

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
        if (!super.equals(o)) return false;
        birds_1_3 birds_1_3 = (birds_1_3) o;
        return Objects.equals(environment, birds_1_3.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }

    @Override
    public String toString() {
        return "birds_1_3{" +
                "environment='" + environment + '\'' +
                '}';
    }
}
