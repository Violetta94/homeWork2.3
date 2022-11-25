package animals;

import java.util.Objects;

public abstract class Birds extends Animals {
    private String environment;

    public Birds(String name, String environment) {
        super(name);
        this.environment = environment;
    }

    public Birds(String name, int age, String environment) {
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
        Birds Birds = (Birds) o;
        return Objects.equals(environment, Birds.environment);
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
