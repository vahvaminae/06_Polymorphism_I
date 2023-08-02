package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        // output(queen.doYourJob());
        // output(worker.doYourJob());
        // output(drone.doYourJob());
     
        // output("---------------------");

        // output(queen.fly());
        // output(worker.fly());
        // output(drone.fly());

        pollObject(queen);
        pollObject(worker);
        pollObject(drone);

            
     }

    private static void pollObject(HoneyBee object){

        output(object.doYourJob());
        output(object.fly());
        output("---------------------");
    }

    // private static void pollObject(Worker object){

    //     output(object.doYourJob());
    //     output(object.fly());
    //     output("---------------------");
    // }

    // private static void pollObject(Drone object){

    //     output(object.doYourJob());
    //     output(object.fly());
    //     output("---------------------");
    // }
   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

