package com.reflection.client;

import com.reflection.model.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectionTest_7 {

//    Accessing field value with Constructor.newInstance

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor con : declaredConstructors) {
            System.out.println("Constructor : "+con.getName());

            Person person;
            if (Modifier.toString(con.getModifiers()).equals("private")){
                con.setAccessible(true);
                person = (Person) con.newInstance();
            }else {
                person = (Person) con.newInstance("jay", 30, true);
            }
            person.showValue();
            System.out.println("-----------------------------------------");
        }
    }
}
