import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {
    public static int cubed(Integer num1) {
        return num1 * num1 * num1;
    }

    public static Integer difference(int num2, int num3){
        return num2 - num3;
    }
    public static Double difference(double num2, double num3){
        return num2 - num3;
    }

//        public static double median(int a[], int n) {
//        // First we sort the array
//        Arrays.sort(a);
//        // check for even case
//        if (n % 2 != 0)
//            return a[n / 2];
//        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
//    }
    public static double median(int[] array) {
        double answer = 0;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            int rightIndex = array.length/2;
            int leftIndex = rightIndex -1;
            int sum = array[rightIndex] + array[leftIndex];
            answer = (double) sum / 2;
        } else {
            return array[array.length / 2];
        }
        return answer;
    }

//    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats) {
//        ArrayList<Cat> catOutput = new ArrayList<>();
//
//        for (Cat cat : cats) {
//            cat.setColor(cat.getColor().toUpperCase());
//            catOutput.add(cat);
//        }
//
//        return catOutput;
//    }
}
