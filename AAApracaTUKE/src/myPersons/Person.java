package myPersons;



public class Person implements Comparable<Person> {
    private String name;
    private int age =5;

    public Person(String name) {
        this(name, 5);
        this.name = name;
    }


    public Person(String name, int age) {
        if (isValidAge(age)) {
            this.age = age;
            this.name = name;
        } else {
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

    private boolean isValidAge(int ageNew) {
        return ageNew > 0 && ageNew <= 150;
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

    @Override
    public int compareTo(Person o) {
        int nameCompare=this.name.compareTo(o.name);
//        if (this.name.compareTo(o.name)==0) {
        if (nameCompare ==0) {
            int ageCompare = this.age - o.age;
            if(ageCompare !=0) {
                return ageCompare;
            }
            return this.age-o.age;
        }
        return this.name.compareTo(o.getName());

    }
}