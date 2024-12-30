import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
//This is the starter code for Karel the Robot AP CSA Thai

public class RobotLetters implements Directions { 
  
  public static void main(String[] args) 
	{
		//My robot's name is Fred
    //Robot fred = new Robot(5,1,East,9);
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter string");
    String string = scan.nextLine();
    
    Robot george = new Robot(10, 1, East, 50);
    Dictionary<String, String> letters = new Hashtable<>();
    letters.put("a", "move-2;pb;tr;move-2;tr;move-1;pb;tl;move-2;tr;move-1;pb;tl;tl;move-4;pb;tl;move-2;tl;move-1;pb;move-1;pb;move-2;tr;move-2;tr;move-5;");
    // letters.put("b", "tr;moveb-4;tl;moveb-2;tl;moveb-2;tl;moveb-2;tr;move-2;tr;moveb-2;tr;moveb-2;");
    letters.put("b", "pb;move-1;pb;move-1;tr;move-1;pb;moveb-3;tr;move-1;pb;move-1;pb;tr;moveb-3;tl;tl;pb;move-1;tl;move-1;pb");
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(0);
    for(String charr : string.split("")) {
      String cmds = letters.get(charr);
      String[] arrCmds = cmds.split(";");
      for(int i = 0; i < arrCmds.length; i++) {
        String curCmd = arrCmds[i];
        System.out.println(curCmd);
        if(curCmd.startsWith("move-")) {
          int times = Integer.parseInt(curCmd.replace("move-", ""));
          moveX(george, times, false);
        }
        if(curCmd.startsWith("moveb-")) {
          int times = Integer.parseInt(curCmd.replace("moveb-",""));
          moveX(george, times, true);
        }
        if(curCmd.equals("tr")) {
          turnRight(george);
        }
        if(curCmd.equals("tl")) {
          george.turnLeft();
        }
        if(curCmd.equals("pb")) {
          george.putBeeper();
        }
      }
    }
  }
  public static void diagonalX(Robot robo, int x, boolean beepers) {
    for(int i = 0; i < x; i++) {
      if(beepers) {
        robo.putBeeper();
      }
      robo.move();
      robo.turnLeft();
      robo.move();
      turnRight(robo);
    }
  }
  public static void turnRight(Robot robo) {
    for(int i = 0; i<3; i++) {
      robo.turnLeft();
    }
  }
  public static void moveX(Robot robo, int x, boolean beepers) {
    for(int i = 0; i < x; i++) {
      if(beepers) {
        robo.putBeeper();
      }
      robo.move();
    }
  }
  /*public static void makeBox(Robot robo) {
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
  }*/
}
