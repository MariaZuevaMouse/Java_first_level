package com.company;

public class Person {
    String fio;
    String position;
    String email;
    long tel;
    int salary;
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Person(String fio, String position, String email, long tel, int salary, int age){
        this.fio=fio;
        this.position=position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age= age;
    }
    public Person(){
    }
    public void personInfo(){
        System.out.println(this.fio + " работает на должности: " + this.position + "\n контактные данные: \n email: " + this.email +" \n телефон: "
                + this.tel + ";\n получает зарплату: " + this.salary + "; \n возраст: " + this.age );
    }
    Person[] arrPerson = new Person[5];




}
