package p3;

public class P3_main {
    public static void main(String[] args) {

    }

    public static int[] elementwiseMultiply(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return new int[0];
        } else {
            int[] return_array = new int[arr1.length];
            for(int i = 0; i < return_array.length; i++) {
                return_array[i] = arr1[i] * arr2[i];
            }
            return return_array;
        }
    }

    public static boolean areOrthogonal(int[] arr1, int[] arr2) {
        int[] multiplied_array = elementwiseMultiply(arr1, arr2);
        int sum = 0;
        for(int i = 0; i < multiplied_array.length; i++) {
            sum += multiplied_array[i];
        }
        if(sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
