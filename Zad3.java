public class Zad3 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i = 0; i < array.length; i++) {
            System.out.println(RArray(array)[i]);
        }
    }
    public static int[] RArray(int[] array) {
        int[] reversedArr = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            reversedArr[i] = array[array.length-1-i];
        }
        return reversedArr;
    }
}