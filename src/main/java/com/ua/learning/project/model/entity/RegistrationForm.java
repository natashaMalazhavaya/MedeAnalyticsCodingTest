package com.ua.learning.project.model.entity;

public class RegistrationForm {

    private String firstName;
    private String lastName;
    private String birthday;
    private int age;

    public RegistrationForm(){}

    public RegistrationForm(String firstName, String lastName, String birthday, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationForm that = (RegistrationForm) o;
        return getAge() == that.getAge() && getFirstName().equals(that.getFirstName()) &&
                getLastName().equals(that.getLastName()) && getBirthday().equals(that.getBirthday());
    }

    @Override
    public int hashCode() {
        if (firstName.length()>3) {
            System.out.println("firstName is more than 3 symbols");
            return 0;
        } else {
            return firstName.hashCode();
        }
    }

    public void printHashCode(RegistrationForm person) {
        System.out.println(person.hashCode());
    }

    public static class Builder {

        private RegistrationForm newPerson;

        public Builder() {
            newPerson = new RegistrationForm();
        }

        public Builder withFirstName(String firstName) {
            newPerson.setFirstName(firstName);
            return this;
        }

        public Builder withLastName(String lastName) {
            newPerson.setLastName(lastName);
            return this;
        }

        public Builder withBirthday(String birthday) {
            newPerson.setBirthday(birthday);
            return this;
        }

        public Builder withAge(int age) {
            newPerson.setAge(age);
            return this;
        }

        public RegistrationForm build() {
            return newPerson;
        }

    }
}
