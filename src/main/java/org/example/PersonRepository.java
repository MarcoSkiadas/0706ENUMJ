package org.example;

//Step 4: Create a class PersonRepository with a list/map of persons.
//Step 5: Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.
/*
Bonus:
Step 8: Write a method in the PersonRepository that counts the number of persons by gender and outputs the results.
Step 9: Add a method in the PersonRepository that searches and returns a person by their name. The method should return an Optional.
Step 10: Write a method in the PersonRepository that searches and returns all persons by their favorite weekday. The method should return a list.
 */
import java.util.*;

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
    public int genderCount(){
        int femaleCount = 0;
        int maleCount = 0;
        int diverseCount = 0;
        for(Person p: persons.values()) {
            switch (p.gender()) {
                case MALE:
                    maleCount++;
                    break;
                case FEMALE:
                    femaleCount++;
                    break;
                case DIVERSE:
                    diverseCount++;
                    break;
                default:
                    System.out.println("Invalid gender");
            }
        }
        System.out.println("Female count: " + femaleCount+ " Male: " + maleCount+ " Diverse: " + diverseCount);
        return femaleCount + maleCount + diverseCount;
    }
    public Optional<Person> getPersonsByName(String name) {
        for(Person p: persons.values()) {
            if(p.name().equals(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
    public List<Person> getPersonsByWeekdays(DaysOfWeek day) {
        List<Person> personSameFavoriteDay = new ArrayList<>();

        for(Person p: persons.values()) {
            if(p.favoriteDay().equals(day)) {
                personSameFavoriteDay.add(p);
            }
        }
        return personSameFavoriteDay;
    }


    public String toString() {
        return "PersonRepository{" +
                "persons=" + persons +
                '}';
    }
}
