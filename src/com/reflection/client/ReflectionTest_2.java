package com.reflection.client;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest_2 {

    //        inspecting the class members
    public static void main(String[] args) {

        try {
            Class<?> c = Class.forName("com.reflection.model.Person");

            System.out.println("-----Getting constructor of the class---------");
            Constructor<?>[] constructors = c.getConstructors();
            System.out.println(Arrays.toString(constructors));

            System.out.println("-----Getting every constructor of the class-------");
            Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
            System.out.println(Arrays.toString(declaredConstructors));

            System.out.println("-----Getting all methods(even inherited) of the class---------");
            Method[] methods = c.getMethods();
            System.out.println(Arrays.toString(methods));

            System.out.println("-----Getting methods of the class---------");
            Method[] declaredMethods = c.getDeclaredMethods();
            System.out.println(Arrays.toString(declaredMethods));

            System.out.println("-----Getting Fields of the class---------");
            Field[] fields = c.getFields();
            System.out.println(Arrays.toString(fields));

            System.out.println("-----Getting every Fields of the class---------");
            Field[] declaredFields = c.getDeclaredFields();
            System.out.println(Arrays.toString(declaredFields));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
