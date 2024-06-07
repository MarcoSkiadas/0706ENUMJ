package org.example;

//Step 3: Create a record 'Person' with the properties 'id', 'name', and 'favoriteDay', where 'favoriteDay' is of type DaysOfWeek.
//Step 7: Expand the Person record with an enum Gender (Male, Female, Diverse).

public record Person(String id, String name, DaysOfWeek favoriteDay, Gender gender) {
}
