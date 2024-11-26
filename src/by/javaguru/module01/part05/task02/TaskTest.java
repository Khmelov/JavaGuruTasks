package by.javaguru.module01.part05.task02;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {


    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("1 1 1").include("true");
        run("1 1 0").include("false");

        run("6 8 6").include("true");
        run("6 8 5").include("true");
        run("6 8 4").include("false");

        run("16 30 18").include("true");
        run("16 30 17").include("true");
        run("16 30 16").include("false");

        run("3 4 2").include("false");
        run("3 4 3").include("true");
        run("3 4 5").include("true");

    }

}
