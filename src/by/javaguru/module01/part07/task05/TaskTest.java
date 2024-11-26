package by.javaguru.module01.part07.task05;

import by.it.HomeWork;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("all")
public class TaskTest extends HomeWork {

    @Test(timeout = 2000)
    public void testSolution() throws Exception {
        String out = run("10").strOut.toString();
        String[] strings = out
                .replace("\n", "")
                .replaceAll("].*", "")
                .replaceAll(".*\\[", "")
                .split("[, ]+");
        List<Integer> list = Arrays.stream(strings).map(Integer::valueOf).toList();
        list = new ArrayList<>(list);
        for (int l = 0, r = 0; r < list.size(); r++) {
            int n = list.size() - 1;
            if (r != l && list.get(l) != list.get(r)) {
                l = r;
            }
            if (
                    (l == 0 && r < n && list.get(r) > list.get(r + 1)) ||
                    (r == n && list.get(l) > list.get(l - 1)) ||
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
