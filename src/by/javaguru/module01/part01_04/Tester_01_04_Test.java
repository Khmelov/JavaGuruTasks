package by.javaguru.module01.part01_04;

import by.it.HomeWork;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("all")
public class Tester_01_04_Test extends HomeWork {
    /*
    Для прохождения тестов создайте JUnit-конфигурацию на свой пакет:

    Поля:
    Name:               Any name
    Test kind:          All in package
    Package:            by.it.module01
    Search for test:    In whole project

    Можно и просто запускать тесты с помощью кнопок Idea справа от кода.
    */

    @Test(timeout = 2000)
    public void testTask01_04_01() throws Exception {
        run("")
                .include("85")
                .include("85")
                .include("1000000")
                .include("4294967295")
                .include("a")
                .include("25")
                .include("234E-5")
                .include("true")
                .exclude("false");
    }

    @Test(timeout = 2000)
    public void testTask01_04_02() throws Exception {
        run("2 2").include("8");
        run("10 20").include("230");
    }

    @Test(timeout = 2000)
    public void testTask01_04_03() throws Exception {
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

    @Test(timeout = 2000)
    public void testTask01_04_04() throws Exception {
        run("123").include("3").exclude("1").exclude("2");
        run("321").include("1").exclude("2").exclude("3");
        run("980").include("0").exclude("9").exclude("8");
    }

    @Test(timeout = 2000)
    public void testTask01_04_05() throws Exception {
        run("1111").include("22");
        run("1234").include("46");
        run("1090").include("100");
        var work = run("9999").include("198");
        var getLastDigit = work.checkMethod("Task01_04_05", "getLastDigit", int.class);
        var resut = work.invoke(getLastDigit, null, Integer.valueOf(9999));
        assertEquals("198", resut.toString());
    }

    @Test(timeout = 2000)
    public void testTask01_04_06() throws Exception {
        run("12345").include("3").exclude("1").exclude("2").exclude("4").exclude("5");
        run("54321").include("3").exclude("1").exclude("2").exclude("4").exclude("5");
        run("99011").include("0").exclude("1").exclude("9");
    }

    @Test(timeout = 2000)
    public void testTask01_04_07() throws Exception {
        var work = run("3 4").include("5");
        var getLastDigit = work.checkMethod("Task01_04_07", "getDistance", double.class, double.class);
        double distance = (double) work.invoke(getLastDigit, null, Double.valueOf(3), Double.valueOf(4));
        assertEquals(5.0, distance, 1e-10);
    }
}
