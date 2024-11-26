package by.javaguru.module01.part04.task04;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("123").include("3").exclude("1").exclude("2");
        run("321").include("1").exclude("2").exclude("3");
        run("980").include("0").exclude("9").exclude("8");
    }

}
