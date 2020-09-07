package Lesson1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        for (int i = 0; i < 5; i++) {
            Outer outer = context.getBean("outer", Outer.class);
            System.out.println("Outer "+outer.getMyNum() + ", Inner "+outer.getInnerNum());
            outer.setInner(context.getBean("inner",Inner.class));
            System.out.println("Outer "+outer.getMyNum() + ", Inner "+outer.getInnerNum());
        }
    }
}
/*
Результат
Outer 1, Inner 1
Outer 1, Inner 2
Outer 2, Inner 3
Outer 2, Inner 4
Outer 3, Inner 5
Outer 3, Inner 6
Outer 4, Inner 7
Outer 4, Inner 8
Outer 5, Inner 9
Outer 5, Inner 10
*/