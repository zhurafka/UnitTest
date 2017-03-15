import javafx.scene.chart.PieChart;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGCalculator {

    @Test(dataProvider = "getSumData", dataProviderClass = DataProviderClass.class)
    public void getSumTest(int x1, int x2, int result) {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.getSum(x1, x2), result, "getSum method is not correct");
    }

    @Test(dataProvider = "getMinusData", dataProviderClass = DataProviderClass.class)
    public void getMinusTest(int x1, int x2, int result) {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.getMinus(x1, x2), result, "getMinus method is not correct");
    }

    @Test(dataProvider = "getDivisionData", dataProviderClass = DataProviderClass.class)
    public void getDivisionTest(int x1, int x2, int result) {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.getDivision(x1, x2), result, "getDivision method is not correct");

    }
}
//дома: 1. внизу "терминал",       2.ввести:     mvn clean test,    3.superfire-reports      mvn -Dtest=class test