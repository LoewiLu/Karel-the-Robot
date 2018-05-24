public class Racetrack extends Karel {
	    public void run(){
        for (int i=0;i<4;i++){
         clearMove();
         turnLeft();
        }

    }
   private void clearMove(){
       while(frontIsClear()){
       move();
       }
//turnLeft();不放在pulic里放在private里也是可以的
   }
}
