package com.reflection.model;

public final class Person {

    private String name;
    private Integer age;
    public Boolean isEmployed;

    public Person(String name, Integer age, Boolean isEmployed) {
        super();
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    private Person() {
        System.out.println("private Person zero arg constructor");
    }

    private Person(String name){
        this.name = name;
    }
    public void showValue(){
        System.out.println("Name: "+name+" Age: "+age+" isEmployed: "+isEmployed);
    }

    private static void greet(String name){
        System.out.println("privately good morning!,"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isEmployed=" + isEmployed +
                '}';
    }
}
