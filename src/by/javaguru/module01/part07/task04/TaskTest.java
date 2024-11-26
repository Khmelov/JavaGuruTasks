package by.javaguru.module01.part07.task04;

import by.it.HomeWork;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        String[] strings = run("").strOut.toString()
                .replace("\n", "")
                .replaceAll("].*", "")
                .replaceAll(".*\\[", "")
                .split("[, ]+");
        Assert.assertTrue("Array is empty", strings.length > 0);
        long uniqueCount = Arrays.stream(strings).distinct().count();
        Assert.assertEquals("Duplicate elements in array", strings.length, uniqueCount);
    }
}
