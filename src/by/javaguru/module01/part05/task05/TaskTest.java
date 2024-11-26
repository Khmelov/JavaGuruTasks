package by.javaguru.module01.part05.task05;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("2 3 4").include("Корней нет");
        run("4 3 2").include("Корней нет");

        run("1 -3 2").include("1").include("2");
        run("1 -6 9").include("3");
        run("1 -20 100").include("10");

        run("11 222 3").include("168295607673").include("135225741447");
    }

}
