import stanford.karel.*;

public class RoadRepairKarel extends SuperKarel{

    public void run(){

        //前方大道，主要任务是move到尽头
        while(frontIsClear()){
            //观察右侧，如果有口，就进
            if(rightIsClear()){
                cleardrop();
            }
            move();
        }
       //走到尽头后，最后一步check
       if(rightIsClear()){
            cleardrop();
            }
    }//run

    //下去后，如果已经有beeper就直接回；如果没有beeper就下完蛋回
    private void cleardrop(){
            turnRight();
            move();
            if(beepersPresent()){
                downBack();
            }
            else{
                downDropBack();
            }
    }
    //不下蛋，回到起始位置
    private void downBack(){
        turnAround();
        move();
        turnRight();
    }
    //下蛋，回到起始位置
    private void downDropBack(){
        putBeeper();
        turnAround();
        move();
        turnRight();
     }
}//public
