import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //запускает тесты по вывбранному порядку

public class OddEvenTest {
    /*Test Data:
            -345 → “Odd”
            0 → “Even”
            222222 → “Even”
            2147483647 + 1 → “Undefined”
    */

    @Order(1)
    @Test
    public void testOddEvenHappyPathPositiveNumber () {
       int a = 222222;
       String expectedResult = "Even";

       //Создаем обьект класса// отвечает за Act
       OddEven oEven = new OddEven(); //OddEven(); - конструктор по умолчанию
       String actualResult = oEven.OddEvenAlgorithm(a);

       //Отвечает Assert pattern
       Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathTwo () {
        int a = 2;
        String expectedResult = "Even";

        OddEven oEven = new OddEven();
        String actualResult = oEven.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathNull () {
        int a = 0;
        String expectedResult = "Even";

        OddEven oEven = new OddEven();
        String actualResult = oEven.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testOddEvenNegativeNumberMinusOne () {
        int a = -1;
        String expectedResult = "Odd";

        OddEven oEven = new OddEven();
        String actualResult = oEven.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testOddEvenNegativeNumber () {
        int a = -345;
        String expectedResult = "Odd";

        OddEven oEven = new OddEven();
        String actualResult = oEven.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathUndefined () {
        long a = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oEven = new OddEven();
        String actualResult = oEven.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
