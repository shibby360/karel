import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import kareltherobot.*;


// Your goal is to create a robot who can make a diamond with 5 beepers on each side.
public class Diamond implements Directions {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in); // Creating an object of Scanner data type
    
    System.out.println("How many beepers do you want on each side of the diamond?");
    int beepers = in.nextInt();
    
    Robot r = new Robot(beepers, 1, East, 30);

    World.setSize(beepers*2-1, beepers*2-1);
    World.setVisible(true);
    World.setDelay(0);

    for(int i = 0; i < 4; i++) {
       for(int j = 0; j < beepers-1; j++) {
         diagonal(r);
       }
       turnRight(r);
     }
  };
  public static void turnRight(Robot robo) {
    robo.turnLeft();
    robo.turnLeft();
    robo.turnLeft();
  };
  public static void diagonal(Robot robo) {
    robo.move();
    robo.turnLeft();
    robo.move();
    robo.putBeeper();
    turnRight(robo);
  };
}