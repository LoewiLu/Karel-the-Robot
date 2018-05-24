// This tells Ecipse about Karel
import stanford.karel.*;


// Define a program called HurldeJumper
public class HurdleJumper extends SuperKarel {
		/*public是可以大家一起搞的 private是我自己偷摸搞出来的
		 * Method: Run
		 * Program execution starts here.
		 */
	    public void run(){
	        for(int i=0;i<8;i++){ //一共有九列，中间有8条棍子，也就是要玩儿8次（第9次的话就是撞东墙了）
	            if(frontIsClear()){
	                move();
	            }else{
	            jumpHurdle();//要有top-down思维，decomposition
	            }
	        }
	    }

	    /*DEFINE
	    *What is jumpHurdle?
	    *Simply just Ascend(jumpup) and over the sticks (move) and Descend(slidedown)
	    */
	    private void jumpHurdle(){
	        jumpup();
	        move();
	        slidedown();
	    }

	    /*DEFINE
	    *What is jumpup?
	    *pre-condition:facing East
	    *if you meet a wall, u should turn left and keep moving till the wall on your rightside disappear,
	    *then stop and turn right facing East
	    */
	    private void jumpup(){
	        turnLeft();
	        while(rightIsBlocked()){
	            move();
	        }
	        turnRight();
	    }

	    /*DEFINE
	    *What is slidedown?
	    *pre-condition: facing East
	    *turn Right facing the ground
	    *one clear way to go till the deadend
	    *then stop and turn left facing East
	    */
	    private void slidedown(){
	        turnRight();
	        while(frontIsClear()) {
	            move();
	        }
	        turnLeft();
	    }
	}
