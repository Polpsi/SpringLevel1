package Lesson1;


public class Outer {
    private static int number = 0;
    private int myNum;

    public int getInnerNum() {
        return inner.getMyNum();
    }

    private Inner inner;

    public int getMyNum() {
        return myNum;
    }

    public void setMyNum(int myNum) {
        this.myNum = myNum;
    }

    Outer(Inner inner){
        myNum = number++;
        this.inner=inner;
    }


}
