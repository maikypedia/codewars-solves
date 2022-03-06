public class FindOdd {

    public static int findIt(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;
                    // System.out.println(counter);
                }
            }
            if (counter % 2 != 0) {
                // System.out.println(counter % 2);
                return a[i];
            }
            counter = 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2 };

        System.out.println(findIt(a));
    }
}