package by.javaguru.module01.part04.task06;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("12345").include("3").exclude("1").exclude("2").exclude("4").exclude("5");
        run("54321").include("3").exclude("1").exclude("2").exclude("4").exclude("5");
        run("99011").include("0").exclude("1").exclude("9");
    }

}
