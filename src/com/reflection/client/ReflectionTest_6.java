package com.reflection.client;

import com.reflection.model.Person;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectionTest_6 {

//    Getting Constructors of a class
    public static void main(String[] args) throws NoSuchMethodException {

        Class<Person> personClass = Person.class;

//        To get 3 arg constructor
        System.out.println("---------------To get 3 arg constructor------------");
        Constructor<Person> constructor = personClass.getConstructor(String.class, Integer.class, Boolean.class);
        Constructor<Person> constructor1 = personClass.getConstructor(new Class[]{String.class, Integer.class, Boolean.class});
        System.out.println(constructor.toString());

//        To get public constructor
        System.out.println("---------------To get public constructor------------");
        Constructor<?>[] constructors = personClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

//        To get private constructor
        System.out.println("---------------To a get private constructor------------");
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor();
        System.out.println(declaredConstructor);

//        To get all constructor
        System.out.println("---------------To get all constructor------------");
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));
    }

}
