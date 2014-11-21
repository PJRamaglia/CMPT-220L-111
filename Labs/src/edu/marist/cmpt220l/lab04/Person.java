package edu.marist.cmpt220l.lab04;

/**
 * Created by Peter J. Ramaglia on 9/25/2014.
 */

public class Person {

    public String firstName;
    public String lastName;
    private int yearBorn;

    public Person(int yearBorn) {
        this.firstName = "";
        this.lastName = "";
        this.yearBorn = yearBorn;
    }

    public Person(String firstName, String lastName, int yearBorn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
    }

    public Person() {
    }

    public int getAge() {
        int currentYear = 2014;
        return currentYear - this.yearBorn;
    }
}