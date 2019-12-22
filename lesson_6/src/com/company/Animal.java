package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }
    public String setName(String name){
        return this.name=name;
    }
    public Animal (String name){
        this.name = name;
    }
//    public Animal(String name, int runLenghtLimit){
//        this.name=setName(name);
//        this.setRunLenghtLimit(runLenghtLimit);
//    }
    public void Run(int distanceLenght){
        System.out.println(this.name +" пробежал " + distanceLenght + " метров! ");
    }
    public void jumpHeight(double height ){
        System.out.println(this.name +" подпрыгнул " + height +" метров ");
    }
    public void swimLenght( int lenght){
        System.out.println(this.name +" проплыл " +lenght +" метров ");
    }
}

