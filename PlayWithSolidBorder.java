package com.example.snakegame;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import static com.example.snakegame.Food1.*;
import static com.example.snakegame.AdvancedSnake.*;

public class PlayWithSolidBorder {
    public static void Tick1(GraphicsContext gc) {
        int width = 32;
        int height = 20;
//        gameOver1 Default value is true
        if (gameOver1) {
            gc.setFill(Color.RED);
            gc.setFont(new Font("", 50));
            gc.fillText("GAME OVER", 250, 250);
            return ;
        }
//        Make Snake Body Move With other
        for (int i = snake1.size() - 1; i >= 1; i--) {
            snake1.get(i).x = snake1.get(i - 1).x;
            snake1.get(i).y = snake1.get(i - 1).y;
        }
    //Direction
        switch (direction1) {
            case up -> {
                snake1.get(0).y--;
                if (snake1.get(0).y < 0) {
                    gameOver1 = true;
                }
            }
            case down -> {
                snake1.get(0).y++;
                if (snake1.get(0).y > height) {
                    gameOver1 = true;
                }
            }
            case left -> {
                snake1.get(0).x--;
                if (snake1.get(0).x < 0) {
                    gameOver1 = true;
                }
            }
            case right -> {
                snake1.get(0).x++;
                if (snake1.get(0).x > width) {
                    gameOver1 = true;
                }
            }
        }
        // eat food
        if (foodX == snake1.get(0).x && foodY == snake1.get(0).y) {
            snake1.add(new Corner( -1,-1));
            newFood1();
        }
//        self destroy When any block of snake touch other
//        Prevent Moving in reverse Direction
        for (int i = 1; i < snake1.size(); i++) {
            if (snake1.get(0).x == snake1.get(i).x && snake1.get(0).y == snake1.get(i).y ) {
                gameOver1 = true;
                break;
            }
        }
        // fill
        // background Color
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width * cornerSize, height * cornerSize);
        // score
        gc.setFill(Color.WHITE);
        gc.setFont(new Font( 30));
        gc.fillText("Your Score: " + (speed1 - 8), 10, 30);
        // random foodColor
//        Initial color
        gc.setFill(Color.color(Math.random(),Math.random(),Math.random()));
//        To Fill Color For Food
//        FillOval make circle body

        gc.fillOval(foodX * cornerSize, foodY * cornerSize, cornerSize, cornerSize);
        // Snake Body

        /*
        for i in [1,2,3,4]:
            print(i)
        * */
        //        for Each
        for (Corner i : snake1) {
            gc.setFill(Color.GREEN);
            gc.fillRect(i.x * cornerSize, i.y * cornerSize, cornerSize - 1, cornerSize - 1);
        }
    }

}