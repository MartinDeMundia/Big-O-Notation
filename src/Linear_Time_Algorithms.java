//O(n)
public class Linear_Time_Algorithms {
    public void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

// Two Inputs – O(m + n)
    public static void printNumbers(int m, int n) {
        for (int i = 0; i < m; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Linear_Time_Algorithms li_ta = new Linear_Time_Algorithms();
        //li_ta.printNumbers(2000);
        li_ta.printNumbers(2000 , 5000);
    }
}
// When we use looping we have a linear complexity. It doesn’t matter if it’s the ‘for’, ‘while’, ‘foreach’, ‘do while’.
// Any of those loopings will have a linear complexity.
