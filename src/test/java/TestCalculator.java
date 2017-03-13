import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


/**
 * Created by softinstall on 13.03.2017.
 */
@RunWith(Parameterized.class)  //указываем, что мы запускаем тест с набором данных
public class TestCalculator {


    @Parameterized.Parameters
    public static Collection dataSum() {
        Object[][] data = new Object[][] {
                {5, 4, 9},
                {3, 3, 6},
                {7, 8, 15}
        };
          return Arrays.asList(data);
    }
    int x1, x2, result;

    public TestCalculator(int x1, int x2, int result) {
        this.x1 = x1;
        this.x2 = x2;
        this.result = result;
    }


    /*юнит тест:
      */
    @Test(timeout = 5000)
    public void getSumTest() {
        Calculator calculator = new Calculator();
        int actualSum = calculator.getSum(x1, x2);
        int expectedSum = result;
        Assert.assertEquals("Method getSum is not valid", expectedSum, actualSum);}


    @After
    public void printMessage() {
        System.out.println("Test passed");
    }

/*
    @Test
    public void getMinusTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("Method getSum is not valid", 15, calculator.getMinus(20, 5));
        } */
}
