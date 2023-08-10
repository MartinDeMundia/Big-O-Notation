
// O(1)
public class Constant_Time_Algorithms {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        System.out.println(num1 + num2);
// Accessing an Array by Index
// Accessing an index of an array has also constant time complexity.
// That’s because once the array is created in memory, we won’t need to traverse the array, or do any other special operation.
        int[] numbers = { 1, 2, 3};
        System.out.println(numbers[1]); // O(1) here
    }
}
// It doesn’t matter how many times we executed this algorithm it will have always a constant time complexity.
// The code above also has O(1) of time complexity.


