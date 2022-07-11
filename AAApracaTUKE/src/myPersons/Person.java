package myPersons;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this(name, 0);
        this.name = name;
    }



    public Person(String name, int age) {
        if (isValidAge(age)) {
            this.age = age;
            this.name=name;
        }
        else {
            this.name = name;
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    private boolean isValidAge (int ageNew) {
        return ageNew >0 && ageNew <=150;
    }


    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;

        }
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}