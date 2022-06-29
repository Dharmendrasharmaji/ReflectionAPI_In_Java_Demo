package com.reflection.client;

import com.reflection.model.Person;

public class ReflectionTest_1 {

    //        There are 3 ways to get the instance of Class class
    public static void main(String[] args) throws ClassNotFoundException {

//        forName() method of Class class
        Class<?> aClass = Class.forName("com.reflection.model.Person");
        System.out.println(aClass);
        System.out.println(aClass.getName());

//        getClass() method of Object class
        System.out.println("---------------------------------------------");
        Person jay = new Person("Jay", 28, true);
        Class<? extends Person> aClass1 = jay.getClass();
        System.out.println(aClass1);
        System.out.println(aClass1.getName());

//        the .class syntax
        System.out.println("---------------------------------------------");
        Class<Person> aClass2 = Person.class;
        System.out.println(aClass2);
        System.out.println(aClass2.getName());


    }
}
