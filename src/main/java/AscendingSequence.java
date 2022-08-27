public class AscendingSequence {

//0, 1, 2, 3, 4, 5
//Алгоритмм
    public int [] ascendingSequenceAlgorithm(int start, int end, int step) { //выбрать метод public,тк вызывается для тестирования.
        if (step > 0 && start < end) {                              // Метод возвращает массив целых чисел в возрастающей
            int[] result = new int[(end - start + 1) / step];               // последовательности

            for (int i = 0; i < result.length; i ++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }
            return result;
        }
        return new int[]{}; //пустой массив
    }
}
