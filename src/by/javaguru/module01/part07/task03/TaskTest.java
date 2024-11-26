package by.javaguru.module01.part07.task03;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        run("")
                .checkCount(8,"0",8)
                .checkCount(17,"1",17)
                .checkCount(4,"\n");
    }
}
