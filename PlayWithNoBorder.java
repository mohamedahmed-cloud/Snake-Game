package com.example.snakegamefinal;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import static com.example.snakegamefinal.Food2.*;
import static com.example.snakegamefinal.advancedSnake.*;
public class PlayWithNoBorder {
    public static void Tick2(GraphicsContext gc) {
        int width = 32;
        int height = 20;
        if (gameOver2) {
            gc.setFill(Color.RED);
            gc.setFont(new Font("", 50));
            gc.fillText("GAME OVER", 250, 250);
            return;
        }
//        Make Snake Body Move With other
        for (int i = snake2.toArray().length - 1; i >= 1; i--) {
            snake2.get(i).x = snake2.get(i - 1).x;
            snake2.get(i).y = snake2.get(i - 1).y;
        }
        switch (direction2) {
            case up:
                snake2.get(0).y--;
                if (snake2.get(0).y < 0) {
                    snake2.get(0).y=height;
                }
                break;
            case down:
                snake2.get(0).y++;
                if (snake2.get(0).y > height) {
                    snake2.get(0).y=0;
                }
                break;
            case left:
                snake2.get(0).x--;
                if (snake2.get(0).x < 0) {
                    snake2.get(0).x=width;
                }
                break;
            case right:
                snake2.get(0).x++;
                if (snake2.get(0).x > width) {
                    snake2.get(0).x=0;
                }
                break;
        }
        // eat food
        if (foodX2== snake2.get(0).x && foodY2== snake2.get(0).y) {
            snake2.add(new Corner( -1,-1));
            newFood2.newFood2();
        }

        for (int i = 1; i < snake2.size(); i++) {
            if (snake2.get(0).x == snake2.get(i).x && snake2.get(0).y == snake2.get(i).y) {
                gameOver2 = true;
            }
        }
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width * cornersize, height * cornersize);
        gc.setFill(Color.WHITE);
        gc.setFont(new Font( 30));
        gc.fillText("Your Score: " + (speed2 - 8), 10, 30);
        // random foodColor
        Color foodColor = Color.color(Math.random(),Math.random(),Math.random());
//        Change Color After Each Eat
        gc.setFill(foodColor);
//        To Fill Color For Food
        gc.fillOval(foodX2 * cornersize, foodY2 * cornersize, cornersize, cornersize);
        // Snake Body
        for (Corner c : snake2) {
//            If We Delete this line the snake body will change according to food
            gc.setFill(Color.LIGHTGREEN);
            gc.fillRect(c.x * cornersize, c.y * cornersize, cornersize - 1, cornersize - 1);
            gc.setFill(Color.GREEN);
            gc.fillRect(c.x * cornersize, c.y * cornersize, cornersize - 2, cornersize - 2);
        }
    }
}
