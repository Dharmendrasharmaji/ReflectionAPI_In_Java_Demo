package com.reflection.client;

import com.reflection.model.Person;

import java.lang.reflect.Field;

public class ReflectionTest_5 {

//    Get Private field of a class
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        Object jay = name.get(new Person("Jay", 30, true));
        String jay1 = (String) jay;
        System.out.println(jay1);

    }
}
