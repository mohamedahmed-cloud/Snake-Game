package com.example.snakegame;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

import static com.example.snakegame.Food1.*;
import static com.example.snakegame.Food2.*;
public class AdvancedSnake extends Application {
    static int width = 32;
    static int height = 20;
    static int cornerSize = 25;
    static List<Corner> snake1 = new ArrayList<>();
    static List<Corner> snake2 = new ArrayList<>();
    static public boolean gameOver1=false;
    static public boolean gameOver2=false;
    //    Direction Class
//    Start Direction
    static Direction direction1 = Direction.left;
    static Direction direction2= Direction.left;

    public void start(Stage primaryStage) {
//        First Window
        //        controllers
        Button btnStart = new Button(" Start ");
        Button btnAbout=new Button(" About ");
        Button btnEnd = new Button(" Exit ");
        //       btn style
        btnStart.setMaxWidth(250);
        btnEnd.setMaxWidth(250);
        btnAbout.setMaxWidth(250);
//        css style
        btnStart.setStyle("-fx-background-color: #c2185b; ");
        btnEnd.setStyle("-fx-background-color: #c2185b; ");
        btnAbout.setStyle("-fx-background-color: #c2185b; ");
//        font
        Font font = new Font(20);
        btnStart.setFont(font);
        btnEnd.setFont(font);
        btnAbout.setFont(font);
        //        layout
        VBox box = new VBox();
        box.setStyle("-fx-background-color: BLACK;");
        box.setSpacing(20);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(btnStart,btnAbout, btnEnd);
        Scene scene = new Scene(box, 800, 500);
        //        Scene Style
        scene.setFill(Color.BLACK);
        //        Stage style
        Image image= new Image("https://cdn-icons-png.flaticon.com/128/5968/5968282.png");
        primaryStage.getIcons().add(image);

//        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setTitle(" Snake Window Start ");
        //      To Launch
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        //       End First Window
        btnEnd.setOnAction(ActionEvent -> primaryStage.close());



//       Second Window
//        About Window
        btnAbout.setOnAction(ActionEvent -> {
            Button btnMain=new Button(" ● About Our Team");
//                our Style
//                first
            Font btnFont=new Font(20);
            btnMain.setStyle("-fx-background-color: BROWN; ");
            btnMain.setPadding(new Insets(10,10,10,10));
            btnMain.setFont(btnFont);
//                Second
            Button btnLeader=new Button(" ● Team Leader");
            btnLeader.setStyle("-fx-background-color: #E5D380; ");
            btnLeader.setPadding(new Insets(8,8,8,8));
            btnLeader.setFont(btnFont);
//                Third
            Font lblFont=new Font(15);
            Label lblYousef=new Label("1. Mohamed Ahmed Yousef");
            lblYousef.setStyle("-fx-background-color: #89F15C; ");
            lblYousef.setPadding(new Insets(8,8,8,8));
            lblYousef.setFont(lblFont);
//                Fourth
            Label btnMember=new Label(" ● Team Member");
            btnMember.setStyle("-fx-background-color: #E5D380; ");
            btnMember.setPadding(new Insets(8,8,8,8));
            btnMember.setFont(btnFont);
//                5th
            Label lblMarwany=new Label("2. Mohamed Ahmed Mohamed Mohamed Marawany ");
            lblMarwany.setStyle("-fx-background-color: #89F15C; ");
            lblMarwany.setPadding(new Insets(8,8,8,8));
            lblMarwany.setFont(lblFont);
//                6th
            Label lblReda=new Label("3. Mohamed Reda Youssef El sayed");
            lblReda.setStyle("-fx-background-color: #89F15C; ");
            lblReda.setPadding(new Insets(8,8,8,8));
            lblReda.setFont(lblFont);
//                7th
            Label lblNour=new Label("4. Mohamed Ahmed Mohamed Mahmoud");
            lblNour.setStyle("-fx-background-color: #89F15C; ");
            lblNour.setPadding(new Insets(8,8,8,8));
            lblNour.setFont(lblFont);
//                8th
            Label lblFekry=new Label("5. mohamed Ahmed Fekry ") ;
            lblFekry.setStyle("-fx-background-color: #89F15C; ");
            lblFekry.setPadding(new Insets(8,8,8,8));
            lblFekry.setFont(lblFont);
//                9th
            Label lblArabi=new Label("6. Mohamed Ashraf El sayed Al Arabi");
            lblArabi.setStyle("-fx-background-color: #89F15C; ");
            lblArabi.setPadding(new Insets(8,8,8,8));
            lblArabi.setFont(lblFont);
//                10th
            Label lblElbana=new Label("7. Mohammed Ebrahim Elawady Elbanna");
            lblElbana.setStyle("-fx-background-color: #89F15C; ");
            lblElbana.setPadding(new Insets(8,8,8,8));
            lblElbana.setFont(lblFont);
//                11th
            Label lblIsmail=new Label("8. Mohamed Ahmed Esmail");
            lblIsmail.setStyle("-fx-background-color: #89F15C; ");
            lblIsmail.setPadding(new Insets(8,8,8,8));
            lblIsmail.setFont(lblFont);

//                Layout
            GridPane grid=new GridPane();
            grid.setPadding(new Insets(30,30,50,50));
            grid.setHgap(10);
            grid.setVgap(10);
            grid.add(btnMain,0,0);
            grid.add(btnLeader,1,1);
            grid.add(lblYousef,2,2);
            grid.add(btnMember,1,3);
            grid.add(lblMarwany,2,4);
            grid.add(lblReda,2,5);
            grid.add(lblNour,2,6);
            grid.add(lblFekry,2,7);
            grid.add(lblArabi,2,8);
            grid.add(lblElbana,2,9);
            grid.add(lblIsmail,2,10);
            Stage primaryStageAbout=new Stage();
            Scene sceneAbout=new Scene(grid,1000,600);
            primaryStageAbout.setResizable(false);
            Image imageAbout=new Image("https://cdn-icons-png.flaticon.com/512/1256/1256650.png");
            primaryStageAbout.getIcons().add(imageAbout);
            primaryStageAbout.setScene(sceneAbout);
            primaryStageAbout.setTitle(" About");
            grid.setStyle("-fx-background-color: #bbdefb;");
            primaryStageAbout.show();
        });
        btnStart.setOnAction(ActionEvent -> {
            //        controllers
            primaryStage.close();
            Button playWithBorder = new Button(" Play With Solid Border  ");
            Button playWithNoBorder = new Button(" Play With No Border ");
            Button returnto = new Button(" Return ");
            Button exit = new Button("   Exit  ");
            //          btn style
            playWithBorder.setMaxWidth(250);
            playWithNoBorder.setMaxWidth(250);
            exit.setMaxWidth(250);
            returnto.setMaxWidth(250);
            playWithBorder.setStyle("-fx-background-color: #c2185b; ");
            playWithNoBorder.setStyle("-fx-background-color: #c2185b; ");
            exit.setStyle("-fx-background-color:#c2185b");
            returnto.setStyle("-fx-background-color:#c2185b");
//            font
            Font font2 = new Font(20);
            playWithBorder.setFont(font2);
            playWithNoBorder.setFont(font2);
            exit.setFont(font2);
            returnto.setFont(font2);
            //  layout
            VBox box2 = new VBox();
            box2.setSpacing(20);
            box2.setAlignment(Pos.CENTER);
            box2.getChildren().addAll(playWithBorder, playWithNoBorder, returnto, exit);
            box2.setStyle("-fx-background-color: BLACK;");
            Scene scene2 = new Scene(box2, 800, 500);
            //           Scene Style
            scene2.setFill(Color.BLACK);
            //          Stage style
            Stage primaryStage2 = new Stage();
            Image image2=new Image("https://cdn-icons-png.flaticon.com/512/840/840513.png");
            primaryStage2.getIcons().add(image2);
            primaryStage2.setTitle(" Choose What You want  ");
            primaryStage2.setScene(scene2);
            primaryStage2.show();
            primaryStage2.setResizable(false);
            exit.setOnAction(ActionEvent1 -> primaryStage2.close());
            returnto.setOnAction(ActionEvent13 -> {
                primaryStage.show();
                primaryStage2.close();
            });
//         Main java fx
//            Third window
            //                PlayWithSolidBorder
            playWithBorder.setOnAction(ActionEvent12 -> {
//                To Handle when Error Game over
                box2.getChildren().remove((returnto));
                box2.getChildren().remove(playWithBorder);
                newFood1();
                VBox root = new VBox();
                Canvas c = new Canvas(width * cornerSize, height * cornerSize);
                GraphicsContext gc = c.getGraphicsContext2D();
                root.getChildren().add(c);
//                The class AnimationTimer allows to create a timer, that is called in each frame while it is active.
//                An extending class has to override the method handle(long) which will be called in every frame.
//                The methods start() and stop() allow to start and stop the timer.
//                We can't  Use Timeline
                new AnimationTimer() {
                    long cycleTime = 0;
                    @Override
                    public void handle(long now) {
                        if (now - cycleTime > 10e8 / speed1) {
                            cycleTime = now;
                            PlayWithSolidBorder.Tick1(gc);
                        }
                    }

                }.start(); //To Start Animation Timer
                Scene scene1 = new Scene(root, width * cornerSize, height * cornerSize);
                // control
                scene1.addEventFilter(KeyEvent.KEY_PRESSED, key -> {
                    if (key.getCode() == KeyCode.UP ||key.getCode()==KeyCode.W) {
                        direction1 = Direction.up;
                    }
                    if (key.getCode() == KeyCode.DOWN || key.getCode()==KeyCode.S) {
                        direction1 = Direction.down;
                    }
                    if (key.getCode() == KeyCode.LEFT || key.getCode()==KeyCode.A) {
                        direction1 = Direction.left;
                    }
                    if (key.getCode() == KeyCode.RIGHT || key.getCode()==KeyCode.D) {
                        direction1 = Direction.right;
                    }
                });
                // Body Of Snake When Start Play
                snake1.add(new Corner(width / 3, height / 2));
                snake1.add(new Corner(width / 3, height / 2));
                snake1.add(new Corner(width / 3, height / 2));
                Stage primaryStage4=new Stage();
                primaryStage4.setScene(scene1);
                Image image4 =new Image("https://img.icons8.com/external-wanicon-flat-wanicon/344/external-snake-st-patrick-day-wanicon-flat-wanicon.png");
                primaryStage4.getIcons().add(image4);
                primaryStage4.setResizable(false);
                primaryStage4.setTitle(" Snake Game With Solid Border ");
                primaryStage4.show();
            });
//                    PlayWithNoBorder
            playWithNoBorder.setOnAction(ActionEvent14 -> {
//                To Handle when Error Game over
                box2.getChildren().remove((returnto));
                box2.getChildren().remove(playWithNoBorder);
                newFood2();
                VBox root = new VBox();
                Canvas c = new Canvas(width * cornerSize, height * cornerSize);
                GraphicsContext gc = c.getGraphicsContext2D();
                root.getChildren().add(c);
                new AnimationTimer() {
                    long CycleTime = 0;

                    public void handle(long now) {
                        if (now - CycleTime > 10e8 / speed2) {
                            CycleTime = now;
                            PlayWithNoBorder.Tick2(gc);
                        }
                    }

                }.start();
                Scene scene12 = new Scene(root, width * cornerSize, height * cornerSize);
                // control
                scene12.addEventFilter(KeyEvent.KEY_PRESSED, key -> {
                    if (key.getCode() == KeyCode.UP || key.getCode()==KeyCode.W) {
                        direction2 = Direction.up;
                    }
                    if (key.getCode() == KeyCode.DOWN || key.getCode()==KeyCode.S) {
                        direction2 = Direction.down;
                    }
                    if (key.getCode() == KeyCode.LEFT || key.getCode()==KeyCode.A) {
                        direction2 = Direction.left;
                    }
                    if (key.getCode() == KeyCode.RIGHT || key.getCode()==KeyCode.D) {
                        direction2 = Direction.right;
                    }
                });
                // Body Of Snake When Start Play
                snake2.add(new Corner(width / 3, height / 2));
                snake2.add(new Corner(width / 3, height / 2));
                snake2.add(new Corner(width / 3, height / 2));
                Stage primaryStage3 = new Stage();
                primaryStage3.setScene(scene12);
//                    primaryStage3.initStyle(StageStyle.UTILITY);
                Image image3=new Image("https://t3.ftcdn.net/jpg/00/99/64/94/240_F_99649474_ZDHlfVnKP2kRvpSk31lAhc5bjBfh9QqZ.jpg");
                primaryStage3.getIcons().add(image3);
                primaryStage3.setResizable(false);
                primaryStage3.setTitle(" Snake Game With No Border");
                primaryStage3.show();
            });
        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}