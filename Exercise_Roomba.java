public class Roomba extends SuperKarel {

		public void run(){
            deadEndAlley();
            rowSweeping();
            backToPosition();
        while(leftIsClear()){
            moveToRow();
            rowSweeping();
            backToPosition();
        }
     }//run

		 private void deadEndAlley(){
         if(frontIsBlocked()){
            turnLeft();
         }
     } //private

		 private void rowSweeping(){
        while(frontIsClear()){
            while(beepersPresent()){
                pickBeeper();
            }
            move();
        }
        while(beepersPresent()){
                pickBeeper();
        }
			}   //private


			private void backToPosition(){
        if(frontIsBlocked()){
            turnAround();
            while(frontIsClear()){
                move();
            }
         }
        turnAround();
			}//private


			private void moveToRow(){
        if(leftIsClear()){
            turnLeft();
            move();
            turnRight();
         }
			 }//private


}//public
