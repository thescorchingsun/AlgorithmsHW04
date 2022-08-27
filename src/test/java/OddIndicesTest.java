import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result = {590, 985, 68}

    @Test
    public void testOddIndicesHappyPath () {

        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};

        OddIndices aOddIndices = new OddIndices();  //OddIndices(); - конструктор по умолчанию
        int [] actualResult = aOddIndices.OddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }



}
