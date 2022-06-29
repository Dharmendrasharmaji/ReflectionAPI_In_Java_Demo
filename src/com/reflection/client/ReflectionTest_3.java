package com.reflection.client;

import com.reflection.model.Person;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest_3 {

    //        Getting Metadata of a class
    public static void main(String[] args) {

        Class<Person> p = Person.class;

//        get the class name
        System.out.println("---------Get class name--------------");
        System.out.println(p.getName());
        System.out.println(p.getSimpleName());

//        get the super class
        System.out.println("---------Get Super class name--------------");
        System.out.println(p.getSuperclass());

//        get the modifiers of the class
        System.out.println("---------Get the modifiers of the class--------------");
        int modifiers = p.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));

//        get the interfaces of the class
        System.out.println("---------Get the interfaces of the class--------------");
        System.out.println(Arrays.toString(p.getInterfaces()));

//        get the all fields of the class
        System.out.println("---------Get the all fields of the class--------------");
        System.out.println(Arrays.toString(p.getFields()));
        System.out.println(Arrays.toString(p.getDeclaredFields()));

//        get the all constructors of the class
        System.out.println("---------Get the all constructors of the class--------------");
        System.out.println(Arrays.toString(p.getConstructors()));
        System.out.println(Arrays.toString(p.getDeclaredConstructors()));

//        get the all methods of the class
        System.out.println("---------Get the all methods of the class--------------");
        System.out.println(Arrays.toString(p.getMethods()));
        System.out.println(Arrays.toString(p.getDeclaredMethods()));

//        get the all annotations of the class
        System.out.println("---------Get the all annotations of the class--------------");
        System.out.println(Arrays.toString(p.getAnnotations()));
        System.out.println(Arrays.toString(p.getDeclaredAnnotations()));
    }
}
