package exsample;

import enums.Gender;

import java.time.Month;

public class Person {
    private String name;
    private Month birthOfMonth;
    private Gender gender;

    public Person() {
    }

    public Person(String name, Month birthOfMonth, Gender gender) {
        this.name = name;
        this.birthOfMonth = birthOfMonth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Month getBirthOfMonth() {
        return birthOfMonth;
    }

    public void setBirthOfMonth(Month birthOfMonth) {
        this.birthOfMonth = birthOfMonth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
