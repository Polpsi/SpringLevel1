package Lesson1;


public class OuterSomething {
    private static int number = 0;
    private int myNum;

    public int getMyNum() {
        return myNum;
    }

    public void setMyNum(int myNum) {
        this.myNum = myNum;
    }

    OuterSomething(){
        myNum = number++;
    }
}
