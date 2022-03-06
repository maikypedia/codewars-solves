public class dosr {
    static boolean checkFibonacci(int[] a, int i) {
        if (i > a.length -1 || a[i] == (a[i-1] + a[i-2])) {
            return true;
        } else {
            return a[i] + checkFibonacci(a, i+1)
        }
    }

    public static void main(String[] args) {
        ;
    }
}
