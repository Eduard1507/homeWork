package com.example.familytree;

import com.example.familytree.model.Person;

import java.util.Comparator;

public class BirthDateComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getBirthDate().compareTo(p2.getBirthDate());
    }
}