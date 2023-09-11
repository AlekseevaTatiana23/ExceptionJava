package seminars;

public class IndexFounder {

        public static int getIndexOfElem (int[] arr, int minLength, int element){
            if (arr == null) {
                return -3;
            }
            if (arr.length <minLength){
                return -1;
            }
            for (int i=0; i<arr.length; i++) {
                if(arr[i] == element) return i;
            }
            return -2;
        }
    }

