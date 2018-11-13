import stanford.karel.Karel;

public class Robot extends Karel {
   public void run() {
       move();
       move();
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       turnLeft();
       move();
       pickBeeper();
       turnLeft();
       turnLeft();
       move();
       move();
       move();
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       putBeeper();
       turnLeft();
       turnLeft();
       turnLeft();
   }
}
