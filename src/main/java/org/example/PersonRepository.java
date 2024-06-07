package org.example;

//Step 4: Create a class PersonRepository with a list/map of persons.
//Step 5: Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<String, Person> persons;

    public PersonRepository() {
        persons = new HashMap<>();
    }
    public Person addPerson(Person person){
       return persons.put(person.id(),person);
    }
    public Optional<Person> getPersons(String ID) {
        return Optional.ofNullable(persons.get(ID));

    }
    public void setPersons(Map<String, Person> persons) {
        this.persons = persons;
    }

    public String toString() {
        return "PersonRepository{" +
                "persons=" + persons +
                '}';
    }
}
