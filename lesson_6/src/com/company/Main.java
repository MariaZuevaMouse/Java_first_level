package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat1= new Cat("Мурзик");
	cat1.jumpHeight(5);
	cat1.jumpHeight(1);
	cat1.swimLenght(3);
	cat1.Run(150);
	cat1.Run(300);

	System.out.println();

	Dog dog1 = new Dog("Шарик");
	dog1.Run(400);
	dog1.Run(700);
	dog1.jumpHeight(0.3);
	dog1.jumpHeight(1);
	dog1.swimLenght(8);
	dog1.swimLenght(15);

	System.out.println();

	Dog dog2 =new Dog("Полкан", 700);
	dog2.Run(400);
	dog2.Run(900);
	dog2.jumpHeight(0.4);
	dog2.jumpHeight(1);
	dog2.swimLenght(7);
	dog2.swimLenght(20);

    }
}
