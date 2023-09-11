public class ArrayLengthCounter {
    public static int getArrayLength (int[] arr, int minLength){
        if (arr.length <minLength){
            return -1;
        }
        return arr.length;
    }
}
