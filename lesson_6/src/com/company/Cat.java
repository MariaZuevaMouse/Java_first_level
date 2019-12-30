package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    private int runLenghtLimit = 200;

    @Override
    public void Run(int distanceLenght) {
        if(distanceLenght<=runLenghtLimit&& distanceLenght>0){
            super.Run(distanceLenght);
        }else System.out.println("Коты не могут пробежать больше 200 метров");

    }
    @Override
    public void jumpHeight(double height) {
        if(height>0&& height<2){
            super.jumpHeight(height);
        }else System.out.println("Кот не может подпрыгнуть выше 2 метра!");
    }

    @Override
    public void swimLenght(int lenght) {
        System.out.println("Коты не умеют плавать.");
    }
}
