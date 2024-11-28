package by.javaguru.module01.part04.task01;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("")
                .include("85")
                .include("22015")
                .include("1000000")
                .include("4294967295")
                .include("a")
                .include("25")
                .include("234E-5")
                .include("true")
                .exclude("false");
    }
}
