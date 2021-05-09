package se.lexicon.models;

import se.lexicon.models.Person;



public class Main {
    public static void main(String[] arg) {


        Person person = new Person();
        System.out.println("Firstname is " + person.getFirstName());
        System.out.println("Lastname is " + person.getLastName());
        System.out.println("Email is " + person.getEmail());
        System.out.println("Id is " + person.getId());
    }
}

