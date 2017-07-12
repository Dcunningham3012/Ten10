public class Functions {

    public static int maxLength(int[] array) {
        if (array.length <= 1) return array.length;
        int maxLength = 1;
        int curLength = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1])
                curLength++;
            else {
                if (maxLength < curLength)
                    maxLength = curLength;
                curLength = 1;
            }
        }
        ;
        return maxLength;
    }


}

