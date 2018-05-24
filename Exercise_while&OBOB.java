// This tells Ecipse about Karel
import stanford.karel.*;

// Define a program called Sweeper
public class Sweeper extends SuperKarel{

    public void run(){
        while(frontIsClear()){
            sweeping();
            move();
        }//while
        sweeping();//这是容易犯错的OBOB
    }//run
    private void sweeping(){
         while(beepersPresent()){ //因为不止一个beeper 所以要用while语句，一直捡到没有
             pickBeeper();
         }//present
     }//sweeping
}//public
