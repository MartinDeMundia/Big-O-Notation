// O(log n)
public class Logarithmic_Time_Algorithms {

    public static int binarySearch(int[] array, int target) {
        int middle = array.length / 2;

        int leftPointer = 0;
        int rightPointer = array.length - 1;

        while (leftPointer <= rightPointer) {
            if (array[middle] < target) {
                leftPointer = middle + 1;
            } else if (array[middle] > target) {
                rightPointer = middle - 1;
            } else {
                return middle;
            }
            middle = (leftPointer + rightPointer) / 2;
        }
        return -1;
    }
    public void testCaseLog3() {
        int [] array = {2, 3, 5, 7, 8, 10, 13, 16};
        System.out.println(binarySearch(array, 2));
    }
    public void testCaseLog20() {
        int [] array = new int[1048576];
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ++number;
        }
        System.out.println(binarySearch(array, 1));
    }


    public static void main(String[] args) {
        Logarithmic_Time_Algorithms lta = new Logarithmic_Time_Algorithms();
        lta.testCaseLog20();
    }

}
