package se.lexicon.models;

import jdk.nashorn.internal.runtime.Undefined;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
   // private AppUser;



    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Person(String firstName, String lastName, String email){
        this(1, firstName, lastName, email);
    }
    public Person(){
        this("undefined", "undefined", "undefiend");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
