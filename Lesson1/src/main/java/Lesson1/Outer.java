package Lesson1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("outer")
@Scope("prototype")
public class Outer {
    private static int number = 0;
    private int myNum;

    public void setInner(Inner inner) {
        this.inner = inner;
    }

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
