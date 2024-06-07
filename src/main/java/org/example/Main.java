package org.example;

// Step 6: In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.
import java.util.Optional;

import static org.example.DaysOfWeek.MONDAY;
import static org.example.DaysOfWeek.TUESDAY;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("1","Hans",MONDAY);
        Person person2 = new Person("2","Hans",TUESDAY);

        System.out.println(person1);

        PersonRepository personRepository = new PersonRepository();

        personRepository.addPerson(person1);
        personRepository.addPerson(person2);

        System.out.println(personRepository);


        System.out.println(personRepository.getPersons("1"));

        printPerson(personRepository.getPersons("1"));
        printPerson(personRepository.getPersons("3"));


    }
    public static void printPerson(Optional<Person> person) {
        if (person.isPresent()) {
            System.out.println(person.get().name()+" "+person.get().favoriteDay());
        }else {
            System.out.println("No person found");
        }
    }
}