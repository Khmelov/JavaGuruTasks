package by.javaguru.module01.part04.task07;

import by.it.HomeWork;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("3 3 4 4").include("41421");
        run("3 5 7 8").include("5");
        run("5 3 8 7").include("5");
        var work = run("7 8 3 5").include("5");
        var getLastDigit = work.checkMethod("Solution", "getLength", int.class, int.class, int.class, int.class);
        double distance = (double) work.invoke(getLastDigit, null, 7, 8, 3, 5);
        assertEquals(5.0, distance, 1e-10);
    }

}
