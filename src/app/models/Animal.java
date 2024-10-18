package app.models;

public class Animal {

    String bark;
    int age;

    public Animal(String bark, int age) {
        this.bark = bark;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "bark='" + bark + '\'' +
                ", age=" + age +
                '}';
    }
}
