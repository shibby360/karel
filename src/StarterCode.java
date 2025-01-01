import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

/* implements is class inheirtance? */
public class StarterCode implements Directions {
  public static void main(String[] args) 
  {
    //My robot's name is Fred
    // Robot fred = new Robot(5,1,South,9);
    // Robot muhriz = new Robot(6,2,North,10);
    Robot shivank = new Robot(19,10,West,50);
    // (pos, pos, dir, # beepers)
    World.setVisible(true); // <- .setVisible(); is method, not function(like in python)
    World.setSize(20,20);
    World.setDelay(0);

    // S
    letterS(shivank, 4);
    // C and walk to C
    // letterC(shivank);
    // end
    shivank.turnLeft();
    shivank.move();
    
  }
  // to make a method make sure it's outside main method, but in Main class
  public static void turnRight(Robot robotName) {
    for(int i = 0; i < 3; i++) { robotName.turnLeft(); }
  }
  public static void moveXtimes(Robot robotName, int times, boolean beepers) {
    for(int i = 0; i < times; i++) {
      if(beepers) { robotName.putBeeper(); }
      robotName.move();
    }
  }
  public static void moveInCircle(Robot robotName) {
    for(int i = 0; i < 4; i++) {
      robotName.move();
      robotName.turnLeft();
    }
  }
  public static void letterS(Robot robotName, int size) {
    moveXtimes(robotName, 3+size, true);
    robotName.turnLeft();
    moveXtimes(robotName, 2+size, true);
    robotName.turnLeft();
    moveXtimes(robotName, 3+size, true);
    turnRight(robotName);
    moveXtimes(robotName, 2+size, true);
    turnRight(robotName);
    moveXtimes(robotName, 3+size, true);
    robotName.putBeeper();
  }
  public static void letterS(Robot robotName) {
    letterS(robotName, 0);
  }
  public static void letterC(Robot robotName) {
    robotName.turnLeft();
    robotName.turnLeft();
    moveXtimes(robotName, 5, false);
    robotName.turnLeft();
    moveXtimes(robotName, 4, true);
    // actual C
    turnRight(robotName);
    moveXtimes(robotName, 3, true);
    turnRight(robotName);
    moveXtimes(robotName, 4, false);
    turnRight(robotName);
    robotName.move();
    moveXtimes(robotName, 2, true);
  }

}
