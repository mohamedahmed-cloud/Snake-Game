package com.example.snakegamefinal;
//package com.example.sankepersoanalwork;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.List;

import static com.example.snakegamefinal.Food1.*;
import static com.example.snakegamefinal.Food2.*;

public class advancedSnake extends Application {
    static int width = 32;
    static int height = 20;
    static int cornersize = 25;
    static List<Corner> snake1 = new ArrayList<>();
    public static Food1 newFood1 =new Food1();
    public static Food2 newFood2 =new Food2();
    public static PlayWithSolidBorder Tick1=new PlayWithSolidBorder();
    public static PlayWithNoBorder Tick2=new PlayWithNoBorder();
    static List<Corner> snake2 = new ArrayList<>();
    static public boolean gameOver1=false;
    static public boolean gameOver2=false;


    //    Direction Class
    private static Direction Dir;
    static Direction direction1 = Dir.left;
    static Direction direction2=Dir.left;


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
        btnStart.setStyle("-fx-background-color: #c2185b; ");
        btnEnd.setStyle("-fx-background-color: #c2185b; ");
        btnAbout.setStyle("-fx-background-color: #c2185b; ");
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
        btnEnd.setOnAction(ActionEvent -> {
            primaryStage.close();
        });
//       Second Window
//        Third Window
        btnAbout.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent ActionEvent) {
//                primaryStage.close();
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
                Label lblMarwany=new Label("2. Mohamed Ahmed Mohamed Mohamed Marawany");
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
                Label lblFekry=new Label("5. mohamed Ahmed Fekry") ;
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
            }
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
//            primaryStage2.initStyle(StageStyle.UTILITY);
            //          to Launch
            //           End Second Window
            primaryStage2.setTitle(" Choose What You want  ");
            primaryStage2.setScene(scene2);
            primaryStage2.show();
            primaryStage2.setResizable(false);
            exit.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                @Override
                public void handle(javafx.event.ActionEvent ActionEvent) {
                    primaryStage2.close();
                }
            });
            returnto.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                @Override
                public void handle(javafx.event.ActionEvent ActionEvent) {
                    primaryStage.show();
                    primaryStage2.close();
                }
            });
//         Main java fx
//            Third window
            //                PlayWithSolidBorder
            playWithBorder.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                @Override
                public void handle(javafx.event.ActionEvent ActionEvent) {
                    box2.getChildren().remove((returnto));
                    box2.getChildren().remove(playWithBorder);
                    newFood1.newFood1();
                    VBox root = new VBox();
                    Canvas c = new Canvas(width * cornersize, height * cornersize);
                    GraphicsContext gc = c.getGraphicsContext2D();
                    root.getChildren().add(c);
                    new AnimationTimer() {
                        long lastTick = 0;
                        public void handle(long now) {
                            if (lastTick == 0) {
                                lastTick = now;
                                Tick1.Tick1(gc);
                                return;
                            }
                            if (now - lastTick > 1000000000 / speed1) {
                                lastTick = now;
                                Tick1.Tick1(gc);
                            }
                        }

                    }.start();
                    Scene scene = new Scene(root, width * cornersize, height * cornersize);
                    // control
                    scene.addEventFilter(KeyEvent.KEY_PRESSED, key -> {
                        if (key.getCode() == KeyCode.UP ||key.getCode()==KeyCode.W) {
                            direction1 = Dir.up;
                        }
                        if (key.getCode() == KeyCode.DOWN || key.getCode()==KeyCode.S) {
                            direction1 = Dir.down;
                        }
                        if (key.getCode() == KeyCode.LEFT || key.getCode()==KeyCode.A) {
                            direction1 = Dir.left;
                        }
                        if (key.getCode() == KeyCode.RIGHT || key.getCode()==KeyCode.D) {
                            direction1 = Dir.right;
                        }
                    });
                    // Body Of Snake When Start Play
                    snake1.add(new Corner(width / 3, height / 2));
                    snake1.add(new Corner(width / 3, height / 2));
                    snake1.add(new Corner(width / 3, height / 2));
                    //If you do not want to use css style, you can just delete the next line.
                    //            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
                    Stage primaryStage4=new Stage();
                    primaryStage4.setScene(scene);
//                    primaryStage4.initStyle(StageStyle.UTILITY);
                    Image image4 =new Image("https://img.icons8.com/external-wanicon-flat-wanicon/344/external-snake-st-patrick-day-wanicon-flat-wanicon.png");
                    primaryStage4.getIcons().add(image4);
                    primaryStage4.setResizable(false);
                    primaryStage4.setTitle(" Snake Game With Solid Border ");
                    primaryStage4.show();
                }
            });
//                    PlayWithNoBorder
            playWithNoBorder.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
                @Override
                public void handle(javafx.event.ActionEvent ActionEvent) {
                    box2.getChildren().remove((returnto));
                    box2.getChildren().remove(playWithNoBorder);
                    newFood2.newFood2();
                    VBox root = new VBox();
                    Canvas c = new Canvas(width * cornersize, height * cornersize);
                    GraphicsContext gc = c.getGraphicsContext2D();
                    root.getChildren().add(c);
                    new AnimationTimer() {
                        long lastTick = 0;

                        public void handle(long now) {
                            if (lastTick == 0) {
                                lastTick = now;
                                Tick2.Tick2(gc);
                                return;
                            }
                            if (now - lastTick > 1000000000 / speed2) {
                                lastTick = now;
                                Tick2.Tick2(gc);
                            }
                        }

                    }.start();
                    Scene scene = new Scene(root, width * cornersize, height * cornersize);
                    // control
                    scene.addEventFilter(KeyEvent.KEY_PRESSED, key -> {
                        if (key.getCode() == KeyCode.UP || key.getCode()==KeyCode.W) {
                            direction2 = Dir.up;
                        }
                        if (key.getCode() == KeyCode.DOWN || key.getCode()==KeyCode.S) {
                            direction2 = Dir.down;
                        }
                        if (key.getCode() == KeyCode.LEFT || key.getCode()==KeyCode.A) {
                            direction2 = Dir.left;
                        }
                        if (key.getCode() == KeyCode.RIGHT || key.getCode()==KeyCode.D) {
                            direction2 = Dir.right;
                        }
                    });
                    // Body Of Snake When Start Play
                    snake2.add(new Corner(width / 3, height / 2));
                    snake2.add(new Corner(width / 3, height / 2));
                    snake2.add(new Corner(width / 3, height / 2));
                    Stage primaryStage3 = new Stage();
                    primaryStage3.setScene(scene);
//                    primaryStage3.initStyle(StageStyle.UTILITY);
                    Image image3=new Image("https://t3.ftcdn.net/jpg/00/99/64/94/240_F_99649474_ZDHlfVnKP2kRvpSk31lAhc5bjBfh9QqZ.jpg");
                    primaryStage3.getIcons().add(image3);
                    primaryStage3.setResizable(false);
                    primaryStage3.setTitle(" Snake Game With No Border");
                    primaryStage3.show();
                }
            });
//     Play Two
//          Fourth Window

        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}
