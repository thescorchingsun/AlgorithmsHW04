public class OddIndices {
    /*
    2. Написать алгоритм OddIndices, который принимает массив чисел, и возвращает массив значений нечетных индексов
Test Data:
Input = {-45, 590, 234, 985, 12, 68}
Expected Result = {590, 985, 68}
     */

    public int[] OddIndicesAlgorithm(int[] array) {

        if (array.length != 0) {
            int[] array1 = new int[array.length / 2];
            int j = 0;
            for (int i = 1; i < array.length; i +=2) {

                array1[j] = array[i];

                j++;
            }
           return array;
        }

        return new int[]{};

    }
}