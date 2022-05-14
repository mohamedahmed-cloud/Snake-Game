package com.example.snakegamefinal;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import static com.example.snakegamefinal.Food1.*;
import static com.example.snakegamefinal.advancedSnake.*;

public class PlayWithSolidBorder {
    public static void Tick1(GraphicsContext gc) {
        int width = 32;
        int height = 20;
        if (gameOver1) {
            gc.setFill(Color.RED);
            gc.setFont(new Font("", 50));
            gc.fillText("GAME OVER", 250, 250);
            return ;
        }
//        Make Snake Body Move With other
        for (int i = snake1.toArray().length - 1; i >= 1; i--) {
            snake1.get(i).x = snake1.get(i - 1).x;
            snake1.get(i).y = snake1.get(i - 1).y;
        }

        switch (direction1) {
            case up:
                snake1.get(0).y--;
                if (snake1.get(0).y < 0) {
                    gameOver1=true;
                }
                break;
            case down:
                snake1.get(0).y++;
                if (snake1.get(0).y > height) {
                    gameOver1=true;
                }
                break;
            case left:
                snake1.get(0).x--;
                if (snake1.get(0).x < 0) {
                    gameOver1=true;
                }
                break;
            case right:
                snake1.get(0).x++;
                if (snake1.get(0).x > width) {
                    gameOver1=true;
                }
                break;
        }
        // eat food
        if (foodX == snake1.get(0).x && foodY == snake1.get(0).y) {
            snake1.add(new Corner( -1,-1));
            newFood1.newFood1();
        }
//        self destroy When any block of snake touch other
//        Prevent Moving in reverse Direction
        for (int i = 1; i < snake1.size(); i++) {
            if (snake1.get(0).x == snake1.get(i).x && snake1.get(0).y == snake1.get(i).y) {
                gameOver1 = true;
            }
        }

        // fill
        // background
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width * cornersize, height * cornersize);

        // score
        gc.setFill(Color.WHITE);
        gc.setFont(new Font( 30));
        gc.fillText("Your Score: " + (speed1 - 8), 10, 30);
        // random foodColor
//        Initial color
        Color foodColor1 = Color.color(Math.random(),Math.random(),Math.random());
//        Change Color After Each Eat
        gc.setFill(foodColor1);
//        To Fill Color For Food
        gc.fillOval(foodX * cornersize, foodY * cornersize, cornersize, cornersize);
        // Snake Body
        for (Corner c : snake1) {
//            If We Delete this line the snake body will change according to food
            gc.setFill(Color.LIGHTGREEN);
            gc.fillRect(c.x * cornersize, c.y * cornersize, cornersize - 1, cornersize - 1);
            gc.setFill(Color.GREEN);
            gc.fillRect(c.x * cornersize, c.y * cornersize, cornersize - 2, cornersize - 2);
        }
    }

}
