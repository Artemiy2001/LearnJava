package com.baraka.oop;

public class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ram ram, Ssd ssd){
        this.ram = ram;
        this.ssd = ssd;
    }



    void load(){
        System.out.println("I am load");
    }

    void stan(){
        System.out.println("Ssd: " + ssd.getValue());
        System.out.println("Ram: " + ram.getValue());
    }
}
