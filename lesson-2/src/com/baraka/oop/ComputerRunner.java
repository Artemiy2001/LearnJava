package com.baraka.oop;

public class ComputerRunner {
    public static void main(String[] args) {

        Ram ram = new Ram(500);
        Ssd ssd = new Ssd(1000);
        Computer computer = new Computer(ram, ssd);
        computer.load();
        computer.stan();

    }
}
