package by.javaguru.module01.part06.task04;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("3 7").include("3");

        run("6 3").include("2");
        run("6 4").include("3");
        run("6 5").include("6");

        run("10 15").include("2");

        run("31 31").include("1");
        run("31 13").include("31").exclude("13");
        run("13 31").include("13").exclude("31");
    }
}
