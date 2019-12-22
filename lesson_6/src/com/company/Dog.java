package com.company;

public class Dog extends Animal {
    public  Dog(String name, int runLimit) {
        super(name);
        runLenghtLimit = setRunLenghtLimit(runLimit);
    }

    public Dog(String name) {
        super(name);
    }
//    public void Dog(String name , int runLimit){
//        super(name);
//        this.runLenghtLimit=setRunLenghtLimit(runLimit);
//    }
    private int runLenghtLimit = 500;

    public int getrunLenghtLimit() {
        return runLenghtLimit;
    }

    public int setRunLenghtLimit(int runLenghtLimit) {
        this.runLenghtLimit = runLenghtLimit;
        return runLenghtLimit;
    }

    @Override
    public void Run(int distanceLenght) {
        if(distanceLenght<getrunLenghtLimit()&& distanceLenght>0){
            super.Run(distanceLenght);
        }else System.out.println(this.getName() + " не может пробежать больше " +getrunLenghtLimit() +" метров! ");
    }

    @Override
    public void jumpHeight(double height) {
        if(height>0&& height<0.5){
            super.jumpHeight(height);
        }else System.out.println("Собака не может подпрыгнуть выше 0.5 метра!");
    }

    @Override
    public void swimLenght(int lenght) {
        if(lenght>0 &&lenght<10){
            super.swimLenght(lenght);
        }else System.out.println("Собака не может проплыть больше 10 метров!");
    }
}
