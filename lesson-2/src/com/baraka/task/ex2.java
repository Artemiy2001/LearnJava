package com.baraka.task;

public class ex2 {
    public static void main(String[] args) {

        int year = 1900;
         if (year % 4 == 0){
             if (year % 100 == 0){
                 if (year % 400 == 0){
                     System.out.println("god visokosnii");
                 }else{
                     System.out.println("god ne visokosnii");
                 }
             }else {
                 System.out.println("god visokosnii");
             }
         }else {
             System.out.println("god ne visokosnii");
         }
    }
}
