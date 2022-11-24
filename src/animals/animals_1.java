package animals;

import java.util.Objects;

public abstract class animals_1 {
    private String name;
    private final int age;

    public abstract void eat();
    public abstract void sleep();
    public abstract void go();

    public animals_1(String name) {
        this.name = name;
        this.age =0;
    }

    public animals_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "default";
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        animals_1 animals_1 = (animals_1) o;
        return age == animals_1.age && Objects.equals(name, animals_1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "animals_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
