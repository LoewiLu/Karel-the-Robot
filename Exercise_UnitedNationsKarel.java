public class UnitedNationsKarel extends SuperKarel {
	public void run(){
      while(frontIsClear()){
        findSpot();
      }
    }//run

    /* find the debris and stop, pick it up
    */
    private void findSpot(){
        if(beepersPresent()){
            pickBeeper();
            buildHouse();
        }
        if(frontIsClear()){
            move();//avoid picking up the bricks you just put down
        }


    }//private

    /*build a house and end up facing East
    */
    private void buildHouse(){
        goToLeft();
        makeThree();
        goToMiddle();
        makeThree();
        goToRight();
        makeThree();
        backToGround();
    }//private
    /* facing up or down all the time
    */
    private void makeThree(){
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
    private void goToLeft(){
        turnAround();
        move();
        turnRight();//facingSky
    }
    private void goToMiddle(){
        turnRight();
        move();
        turnRight();//facingGround
    }
    private void goToRight(){
        turnLeft();
        move();
        turnLeft();//facingSky
    }
    private void backToGround(){
        turnAround();
        while(frontIsClear()){
            move();
        }
        turnLeft();//facingEast
    }
}
