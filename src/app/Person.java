package app;

public class Person {

    public String name;
    public int age;
    public boolean sex;
    public String profession;

    //public String colorEyes;

//    public Person(String name, int age, String profession) {
//        this.name = name;
//        this.age = age;
//        this.profession = profession;
//    }
//
//    public Person(String name, String colorEyes, int age ) {
//        this.name = name;
//        this.age = age;
//        this.profession = profession;
//    }


    public Person(String name, int age, boolean sex, String profession) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex="  + (sex ? "male" : "female") +
                ", profession='" + profession + '\'' +
                '}';

    }
}
