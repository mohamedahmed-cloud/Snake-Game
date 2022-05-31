package com.example.snakegame;



import java.util.Random;

public class Food1 {
    static int foodX = 0;
    static int foodY = 0;
    static Random rand2=new Random();
    static int width = 32;
    static int height = 20;
    static int speed1 = 7;
    public static void newFood1() {
        while (true) {
            foodX = rand2.nextInt(width);
            foodY = rand2.nextInt(height);
            speed1++;
            break;
        }
    }


}