package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Иванов Иван Иванович", "заведущий", "ivan@ivan.com", 8123456789L, 100, 41);
        person1.personInfo();
        Person person2= new Person();
        person2.fio = "Петров Петр Петрович";
        person2.position = "управляющий";
        person2.email = "petr@petr.com";
        person2.tel = 89999999999L;
        person2.salary=100;
        person2.setAge(43);

        Person[] arrPerson = new Person[5];
        arrPerson[0]=person1;
        arrPerson[1]=person2;
        arrPerson[2]= new Person("Сидоров Сидр Сидорович", "менеджер", "sidr@sidr.com", 87776665544L, 100,39);
        arrPerson[3] = new Person("Каталова Людмила Петровна", "директор по маркетингу", "katal@kat.com", 7771777L, 100,25);
        arrPerson[4] = new Person("Пружинин Евгений Викторович", "дизайнер", "pruzh@evgen.com", 1234567891L,100, 45);

        System.out.println();
        System.out.println("Сотрудники компании старше 40 лет:");
        for(int i =0; i<arrPerson.length; i++){
            if(arrPerson[i].getAge()>=40){
                arrPerson[i].personInfo();
            }
        }



    }
}
