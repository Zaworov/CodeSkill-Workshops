package January2018;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void test1() {
        int[] givenArray = {1, 2, 3, 7, 8};
        int expectedResult = 4;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void test2() {
        int[] givenArray = {-4, -3, 1, 2, 5};
        int expectedResult = 3;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void test3() {
        int[] givenArray = {1, 3, 7, 8};
        int expectedResult = 2;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void test4() {
        int[] givenArray = {1, 2, 3, 4, 5};
        int expectedResult = 6;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void test5() {
        int[] givenArray = {1, 1, 2, 2, 3, 5};
        int expectedResult = 4;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void test6() {
        int[] givenArray = {-4, -2, -1};
        int expectedResult = 1;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void test7() {
        int[] givenArray = {-2, -1, -0};
        int expectedResult = 1;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void test8() {
        int[] givenArray = {-2, 0, 2};
        int expectedResult = 1;
        int result = Logic.getFirstPositiveNumber(givenArray);
        assertEquals(expectedResult, result);
    }
}