package Lesson1;

public class Inner {
    private static int number = 0;
    private int myNum;

    public int getMyNum() {
        return myNum;
    }

    public void setMyNum(int myNum) {
        this.myNum = myNum;
    }

    Inner(){
        myNum = number++;
    }
}
