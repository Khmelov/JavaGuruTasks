package by.javaguru.module01.part04.task03;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        Byte sec = 13;
        Byte min = 31;
        Byte hours = 17;
        Byte days = 3;
        Byte weeks = 31;
        Long in = sec + 60L * min + 3600 * hours + 24 * 3600 * days + 24 * 3600 * 7 * weeks;
        run(in.toString())
                .include(sec.toString())
                .include(min.toString())
                .include(hours.toString())
                .include(days.toString())
                .include(weeks.toString());
    }
}
