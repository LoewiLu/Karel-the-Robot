public class MazeRunner extends SuperKarel {
    public void run(){
        while (noBeepersPresent()){
           turnRight();
           while(frontIsBlocked()){
               turnLeft();
           }
            move();
        }
        pickBeeper();
    }//run
}//public
