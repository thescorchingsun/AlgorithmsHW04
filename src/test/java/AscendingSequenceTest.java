import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Запускает @order по указанному порядку

public class AscendingSequenceTest {
    //тесты всгда public, void всегда, тк не возвращает результат. Всегда начинаются со слова Test //отвечает за Arrange

    /* Удобно использовать, если в каждом тесте есть одинаковые предусловия (логин)
    AscendingSequence as;
    @BeforeEach
    void setUp() {
        as = new AscendingSequence();
    }
    */

    @Order(1)
    @Test
    public void testAscendingSequenceHappyPathPositiveNumber () {
        //0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        //Создаем обьект класса// отвечает за Act
        AscendingSequence aSequence = new AscendingSequence();  //AscendingSequence(); - конструктор по умолчанию
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        //Отвечает Assert pattern
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @RepeatedTest(5)
    @Test
    public void testAscendingSequencePathNegativeNumber () {
        //-10, -9, -8, -7
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence aSequence = new AscendingSequence();  //AscendingSequence(); - конструктор по умолчанию
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testAscendingSequencePathNegativePositiveNumber () {
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence aSequence = new AscendingSequence();  //AscendingSequence(); - конструктор по умолчанию
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Test  //негативный тест
    public void testAscendingSequenceStepTwo () {
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence aSequence = new AscendingSequence();  //AscendingSequence(); - конструктор по умолчанию
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Order(4)
    @Test
    public void testAscendingSequenceStartLargerThenEnd () {
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence aSequence = new AscendingSequence();  //AscendingSequence(); - конструктор по умолчанию
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceNegativeStep () {
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence aSequence = new AscendingSequence();  //AscendingSequence(); - конструктор по умолчанию
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceStepIsZero () {
        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence aSequence = new AscendingSequence();  //AscendingSequence(); - конструктор по умолчанию
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }














    }

