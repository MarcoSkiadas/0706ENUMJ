package org.example;

/*
Step 6: In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.
 */
import java.util.Optional;

import static org.example.DaysOfWeek.MONDAY;
import static org.example.DaysOfWeek.TUESDAY;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("1","Hans",MONDAY,Gender.MALE);
        Person person2 = new Person("2","Hanna",TUESDAY,Gender.FEMALE);
        Person person3 = new Person("3","Svetlana",TUESDAY,Gender.FEMALE);

        System.out.println(person1);

        PersonRepository personRepository = new PersonRepository();

        personRepository.addPerson(person1);
        personRepository.addPerson(person2);
        personRepository.addPerson(person3);

        System.out.println(personRepository);


        System.out.println(personRepository.getPersons("1"));

        printPerson(personRepository.getPersons("1"));
        printPerson(personRepository.getPersons("4"));

        System.out.println(personRepository.genderCount());

        printPerson(personRepository.getPersonsByName("Hans"));

        System.out.println(personRepository.getPersonsByWeekdays(TUESDAY));

    }
    public static void printPerson(Optional<Person> person) {
        if (person.isPresent()) {
            System.out.println(person.get().name()+" "+person.get().favoriteDay());
        }else {
            System.out.println("No person found");
        }
    }
}