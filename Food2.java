package com.example.snakegame;

//To Make Random position for food
import java.util.Random;
public class Food2 {
    static int foodX2 = 0;
    static int foodY2 = 0;
    static Random rand2=new Random();
    static int width = 32;
    static int height = 20;
    static int speed2 = 7;
    public static void newFood2() {
//        To Create random food until it change to false
        while (true) {
//          any point in two dimension plate has two coordinate x,y
            foodX2 = rand2.nextInt(width);
            foodY2 = rand2.nextInt(height);
            speed2++;
            break;
        }
    }
}
