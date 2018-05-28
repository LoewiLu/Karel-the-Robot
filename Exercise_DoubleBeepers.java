public class DoubleBeepers extends SuperKarel {
    public void run(){
        move();
        doubleBeepers();
        move();
    }
    private void doubleBeepers(){
        if(beepersPresent()){
            pickBeeper();
            doubleBeepers();
            putBeeper();
            putBeeper();
        }
    }
}
