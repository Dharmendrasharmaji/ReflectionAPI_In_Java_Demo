package com.reflection.client;

import com.reflection.model.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest_1_Instance {

    //    creating Instance using Class.newInstance and Constructor.newInstance
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Person> personClass = Person.class;

        try {
            Person person = personClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        try {
            Person hema = constructor.newInstance("Hema");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
