package by.javaguru.module01.part04.task05;

import by.it.HomeWork;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("1111").include("22");
        run("1234").include("46");
        run("1090").include("100");
        var work = run("9999").include("198");
        var getLastDigit = work.checkMethod("Solution", "calculate", int.class);
        var resut = work.invoke(getLastDigit, null, Integer.valueOf(9999));
        assertEquals("198", resut.toString());
    }

}
