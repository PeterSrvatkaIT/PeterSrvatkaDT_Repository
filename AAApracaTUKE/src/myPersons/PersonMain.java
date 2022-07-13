package myPersons;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class PersonMain {
    protected char sortby;
    private int color;

    public static void main(String[] args) {
        Person clovek1, clovek2;
        Person[] persons = {
                new Person("Janko", 15),
                new Person("Peter", 20),
                new Person("Peter", 5),
                new Person("Martin", 54),
                new Person("Janko", 65),
//                new Employee("Ondrej","murar"),
//                new Student( "Dezider", "459687", 54),
        };
        Arrays.sort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
                    }
        System.out.println("");

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

