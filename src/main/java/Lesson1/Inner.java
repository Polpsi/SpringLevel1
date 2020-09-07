package Lesson1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inner")
@Scope("prototype")
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
