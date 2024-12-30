import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class EmojiBotPractice implements Directions { 
  
  public static void main(String[] args) 
	{
		//My robot's name is Fred
    //Robot fred = new Robot(5,1,East,9);
    Robot emojiBot = new Robot(5, 2, East, 50);
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(0);
    makeBox(emojiBot);
    emojiBot.turnLeft();
    for(int i = 0; i < 4; i++) {
      emojiBot.move();
    }
    makeBox(emojiBot);
    emojiBot.move();
    emojiBot.move();
    emojiBot.move();
    emojiBot.turnLeft();
    emojiBot.move();
    emojiBot.move();
    emojiBot.turnLeft();
    emojiBot.turnLeft();
    moveBeepX(emojiBot, 7);

  }
  public static void turnRight(Robot robo) {
    for(int i = 0; i<3; i++) {
      robo.turnLeft();
    }
  }
  public static void moveBeepX(Robot robo, int x) {
    for(int i = 0; i < x; i++) {
      robo.putBeeper();
      robo.move();
    }
  }
  public static void makeBox(Robot robo) {
    moveBeepX(robo, 2);
    robo.putBeeper();
    robo.turnLeft();
    moveBeepX(robo, 3);
    robo.putBeeper();
    robo.turnLeft();
    moveBeepX(robo, 2);
    robo.putBeeper();
    robo.turnLeft();
    moveBeepX(robo, 3);
    robo.putBeeper();
  }

  
}