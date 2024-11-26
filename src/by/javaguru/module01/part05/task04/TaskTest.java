package by.javaguru.module01.part05.task04;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("1").include("1").include("рубль").exclude("рубля").exclude("рублей");
        run("121").include("121").include("рубль").exclude("рубля").exclude("рублей");
        run("2").include("2").exclude("рубль").include("рубля").exclude("рублей");
        run("12").include("12").exclude("рубль").exclude("рубля").include("рублей");
        run("20").include("20").exclude("рубль").exclude("рубля").include("рублей");
        run("3").include("3").exclude("рубль").include("рубля").exclude("рублей");
        run("4").include("4").exclude("рубль").include("рубля").exclude("рублей");
        run("5").include("5").exclude("рубль").exclude("рубля").include("рублей");
    }

}
