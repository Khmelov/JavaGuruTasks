package by.javaguru.module01.part05.task03;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("1").include("понедельник");
        run("2").include("вторник");
        run("4").include("четверг");
        run("7").include("воскресенье");
    }
}
