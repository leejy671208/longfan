package org.exllinoTest;

import org.testng.annotations.Test;

public class MainTest {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is : " + i);
    }
}
