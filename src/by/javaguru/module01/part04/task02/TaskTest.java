package by.javaguru.module01.part04.task02;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {


    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("2 2").include("8");
        run("10 20").include("230");
    }

}
