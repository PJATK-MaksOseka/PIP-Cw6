public class Zad4 {
    public static void main(String[] args) {
        int[] genArray = generateArray(100);
        printArray(genArray);
        int[] sortedArray = sort(genArray);
        printArray(sortedArray);
        int[] revArray = reverse(sortedArray);
        printArray(revArray);
        System.out.println(equalsReverse(sortedArray,revArray));
    }
    public static boolean equalsReverse(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[array2.length-i-1]) {
                return false;
            }
        }
        return true;
    }
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length-1-i];
        }
        return reversedArray;
    }
    public static int[] generateArray(int arrayLength) {
        int array[] = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int)(Math.random()*(101));
        }
        return array;
    }
    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("}");
    }
}