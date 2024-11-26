package by.javaguru.module01.part07.task02;

import by.it.HomeWork;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        String out = run("").strOut.toString();
        String[] str = out
                .replace("\n", "")
                .replaceAll("].*", "")
                .replaceAll(".*\\[", "")
                .split(", ");

        Assert.assertEquals("Size of array is not 10", 10, str.length);
        int[] arr = new int[str.length];
        int pos = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            int value = Integer.parseInt(str[i]);
            if (value > max) {
                max = value;
                pos = i;
            }
        }
        boolean contains = out.replaceAll(".*]", "").contains(Integer.toString(pos));
        String err = "Assertion %d with index %d".formatted(max, pos);
        Assert.assertTrue(err,contains);
    }
}
