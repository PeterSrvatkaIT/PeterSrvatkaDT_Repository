package myPersons;

public class PersonMain {

        public static void main(String[] args) {
            Person[] persons = {
                    new Person("Janko"),
                    new Person("Peter", 20),
                    new Person ("Ferko",1060),
            };

            for (Person person : persons) {

                System.out.println(person);
            }
        }
    }

