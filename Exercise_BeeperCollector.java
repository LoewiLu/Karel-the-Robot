public class BeeperCollector extends SuperKarel {
	public void run(){

        collectAllBeepers();
        putOnTheCorner();

    }//run
    /*
    one time, one row, check all rows exept the last one
    */
    private void collectAllBeepers(){
        while(frontIsClear()){
            collectOneRow();
            backToPosition();
            move();
        }
    }//private facingEast
    /*
    check one row and collect a line of beepers
    */
    private void collectOneRow(){
        turnLeft();
        while(frontIsClear()){
            if(beepersPresent()){
                pickBeeper();
            }
            move();
        }
        if(beepersPresent()){
            pickBeeper();
        }
    }//private facing North
    /*
    turn around go back to the initial position
    */
    private void backToPosition(){
        turnAround();
        while(frontIsClear()){
            move();
        }
        turnLeft();
    }//private facingEast
     /*
     put all the beepers on the corner
    */
    private void putOnTheCorner(){
        while(beepersInBag()){
            putBeeper();
        }
    }

}//public
