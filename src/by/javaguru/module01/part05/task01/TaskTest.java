package by.javaguru.module01.part05.task01;

import by.it.HomeWork;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        var work = run("7").include("true").exclude("false");
        run("777").include("true").exclude("false");
        run("17").include("true").exclude("false");
        run("23427").include("true").exclude("false");
        run("0").include("false").exclude("true");
        run("76").include("false").exclude("true");
        run("77771").include("false").exclude("true");
        var method = work.checkMethod("Solution", "isLastDigitSeven", int.class);
        boolean result = (boolean) work.invoke(method, null, 7);
        assertTrue(result);
    }

}
