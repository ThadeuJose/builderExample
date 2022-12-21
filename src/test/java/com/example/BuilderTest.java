package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void shouldCreateAPerson() {
        Person person = Person.builder()
                .givenName("Aaron")
                .additionalName("A")
                .familyName("Aardvark")
                .interest("history")
                .interest("sport")
                .build();
        assertEquals("Aaron", person.getGivenName());
        assertEquals("A", person.getAdditionalName());
        assertEquals("Aardvark", person.getFamilyName());
        assertEquals("history", person.getInterest().get(0));
        assertEquals("sport", person.getInterest().get(1));
    }

    @Test
    public void shouldCreateAPersonWithList() {
        String[] list = { "history", "sport" };
        Person person = Person.builder()
                .givenName("Aaron")
                .additionalName("A")
                .familyName("Aardvark")
                .interest(list)
                .build();
        assertEquals("Aaron", person.getGivenName());
        assertEquals("A", person.getAdditionalName());
        assertEquals("Aardvark", person.getFamilyName());
        assertEquals("history", person.getInterest().get(0));
        assertEquals("sport", person.getInterest().get(1));
    }
}
