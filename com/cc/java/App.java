package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.*;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();
        Bird bird = new Bird();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        pollObj(bird);

    }

    // ---- 4. Iteration Polymorphie -----//
    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
    }
    
    // ---- 5. Überladung -----//
    private static void pollObj(Bird obj){
        output(obj.hasFeathers());
        output(obj.fly());
        output("-----------------");
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
