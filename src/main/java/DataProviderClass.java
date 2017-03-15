import org.testng.annotations.DataProvider;

/**
 * Created by st on 15.03.2017.
 */
public class DataProviderClass {

    @DataProvider(name = "getSumData")
    public static Object[][] getSumData() {
        return new Object[][]{

                {4, 3, 7},
                {5, 5, 10},
                {1, 7, 8}
        };
    }

    @DataProvider(name = "getMinusData")
    public static Object[][] getMinusData() {
        return new Object[][]{

                {14, 3, 11},
                {5, 5, 0},
                {10, 7, 3}
        };
    }

    @DataProvider(name = "getDivisionData")
    public static Object[][] getDivisionData() {
        return new Object[][]{

                {12, 4, 3},
                {15, 5, 3},
                {21, 7, 3}


        };
    }
}
