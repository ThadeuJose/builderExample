package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private final String givenName;
    private final String additionalName;
    private final String familyName;
    private final List<String> interest;

    private Person(PersonBuilder personBuilder) {
        givenName = personBuilder.givenName;
        additionalName = personBuilder.additionalName;
        familyName = personBuilder.familyName;
        interest = personBuilder.interest;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public List<String> getInterest() {
        return new ArrayList<String>(interest);
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private String givenName;
        private String additionalName;
        private String familyName;
        private List<String> interest;

        public PersonBuilder() {
            interest = new ArrayList<>();
        }

        public PersonBuilder givenName(String name) {
            givenName = name;
            return this;
        }

        public PersonBuilder additionalName(String name) {
            additionalName = name;
            return this;
        }

        public PersonBuilder familyName(String name) {
            familyName = name;
            return this;
        }

        public PersonBuilder interest(String interest) {
            this.interest.add(interest);
            return this;
        }

        public PersonBuilder interest(String... list) {
            Collections.addAll(interest, list);
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

}
