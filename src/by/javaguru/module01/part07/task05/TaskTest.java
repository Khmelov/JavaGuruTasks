package by.javaguru.module01.part07.task05;

import by.it.HomeWork;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        var out = run("10").strOut.toString();
        var strings = out
                .replace("\n", "")
                .replaceAll("].*", "")
                .replaceAll(".*\\[", "")
                .split("[, ]+");
        assertEquals("Incorrect size", 10, strings.length);
        var list = new ArrayList<>(
                Arrays.stream(strings).map(Integer::valueOf).toList()
        );
        for (int l = 0, r = 0; r < list.size(); r++) {
            int n = list.size() - 1;
            l = (r != l && list.get(l) != list.get(r)) ? r : l;
            if (
                    (l == 0 && r < n && list.get(r) > list.get(r + 1)) ||
                    (r == n && l > 0 && list.get(l) > list.get(l - 1)) ||
                    (l > 0 && r < n &&
                     list.get(r) > list.get(r + 1) &&
                     list.get(l) > list.get(l - 1))
            ) {
                while (l <= r) {
                    list.remove(l);
                    r--;
                }
                r = l;
            }
        }
        boolean found = out.contains(list.toString());
        assertTrue("Expected: " + list.toString(), found);
    }
}
