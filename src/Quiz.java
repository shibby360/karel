import kareltherobot.*;

public class Quiz implements Directions {
  public static void main(String[] args) {
    World.setVisible(true);
    World.setSize(10, 10);
    World.setDelay(100);

    Robot fred = new Robot(9, 1, East, 50);
    makePattern(fred);
  }
  public static void makePattern(Robot r) {
    makeT(r, 2);
    r.move();
    r.move();
    turnRight(r);
    r.move();
    r.turnLeft();
    r.move();
    r.turnLeft();
    r.turnLeft();
    makeT(r, 4);
    r.turnLeft();
    r.move();
    r.turnLeft();
    beepMoveX(r, 2);
    r.putBeeper();
    r.turnLeft();
    r.move();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.move();
  }
  public static void makeT(Robot r, int n) {
    beepMoveX(r, 2);
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.turnLeft();
    r.move();
    beepMoveX(r, n);
  }
  public static void beepMoveX(Robot r, int x) {
    for(int i = 0; i < x; i++) {
        r.putBeeper();
        r.move();
    }
  }
  public static void turnRight(Robot r) {
    for(int i = 0; i < 3; i++) {
        r.turnLeft();
    }
  }
}