package myPersons;

public class PersonMain {

    public static void main(String[] args) {
        Person clovek1, clovek2;
        Person[] persons = {
                new Person("Janko"),
                new Person("Peter", 20),
                new Person("Ferko", 1060),
                new Employee("Ondrej","murar"),
                new Student( "Dezider", "459687", 54),
        };
        clovek1=new Person("Leonard");
        clovek2=clovek1;
        System.out.println(clovek1);
        System.out.println(clovek2);
        clovek2.setName("Layla");

        System.out.println(clovek1);
        System.out.println(clovek2);

        for (Person person : persons) {

            System.out.println(person);
        }
    }
}

