package com.reflection.client;

import com.reflection.model.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest_4 {

    //  Invoking a private method of a class
    public static void main(String[] args) {

        Class<Person> p = Person.class;
        try {
            Method greet = p.getDeclaredMethod("greet", String.class);
            greet.setAccessible(true);
            greet.invoke(new Person("Jay",30,true),"Jayakumar");
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
