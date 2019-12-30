package com.company;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public int getAppetite(){
        return appetite;
    }

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite=appetite;
        this.satiety = false;
    }
    public void eat(Plate plate){
        if(plate.decreaseFood(appetite)){
            satiety = true;
            System.out.println("Thank you, The cat " + this.name+ " is full. Plate: "+plate.getFood() +" appetite: " + this.appetite);
        }else {
            satiety = false;
            System.out.println("There is not food for the Cat " +this.name+ ". Plate: "+plate.getFood() +" appetite: " + this.appetite);

        }
    }

}
class Plate{
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public int getFood(){
        return food;
    }
    public boolean decreaseFood(int minus){
        if(minus>food){

            return false;
        }else {
            food -=minus;
            return true;
        }
    }
    public void addFood(int addFood){
        food +=addFood;
    }
    public void info(){
        System.out.println("Plate: " + food);
    }

}
class Main{
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 200);
        Plate plate = new Plate(1000);
        plate.info();
        cat.eat(plate);
        plate.info();

        Cat cat2 = new Cat("Lapkin",300);

        Cat[] arrCat = new Cat[] {cat, cat2,new Cat("Barsik",500),new Cat("Pushok",500),new Cat("Vasya",350)};
        feedCats(arrCat, plate);
        plate.info();
        plate.addFood(1550);
        System.out.println();

        feedCats(arrCat,plate);


    }
    public static void feedCats(Cat[] cats, Plate plate){
        for(int i=0; i<cats.length; i++){
            cats[i].eat(plate);
        }
    }
}
