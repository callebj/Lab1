package com.company;

import java.awt.*;

//TESTING
public class Main {

    public static void main(String[] args) {
        // write your code here
        Volvo240 d24 = new Volvo240();
        Volvo240 d25 = new Volvo240();
        Saab95 a = new Saab95();
//
//        System.out.println(d24.modelName);
//        System.out.println(d24.currentSpeed);
//        d24.incrementSpeed(10);
//        System.out.println(d24.currentSpeed);
        System.out.println(d24.getCurrentSpeed());
        System.out.println(a.getCurrentSpeed());
        System.out.println(d25.getCurrentSpeed());

        d24.incrementSpeed(10);

        System.out.println(d24.getCurrentSpeed());
        System.out.println(a.getCurrentSpeed());
        System.out.println(d25.getCurrentSpeed());

        System.out.println("-------------");

        System.out.println(d24.getColor());
        System.out.println(a.getColor());
        System.out.println(d25.getColor());

        d24.setColor(Color.cyan);

        System.out.println(d24.getColor());
        System.out.println(a.getColor());
        System.out.println(d25.getColor());


        System.out.println("----------------");

        System.out.println("X: "+ a.x + " Y: " + a.y);
        a.startEngine();
        a.incrementSpeed(10);
        a.move();
        a.turnLeft();
        a.move();
        a.turnRight();
        a.move();
        a.move();

        d25.startEngine();
        d25.incrementSpeed(10);
        d25.move();

        System.out.println("X: "+ a.x + " Y: " + a.y + " " + d25.x + " " + d25.y);

        a.setTurboOn();
        System.out.println(d24.speedFactor());






    }
}
