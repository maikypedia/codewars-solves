public class tribonacci {
    
    /**public static int[] returnTribonacci(int arr[], int n) {
        int[] res;
        int i;
        int new_element;
        if (n == 0) { return new int[0]; } 
        i = arr.length;

        for zz


    }
    **/
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int[] res = new int[5];
        int pos = 0;

        for (int i : num) {
            res[pos] = i;
            pos++;
        }
        while (pos != n) {
            System.out.println(pos);
            new_element = res[pos-1] + res[pos-2] + res[pos-3];
            pos++;
        }

        //System.out.println(returnTribonacci(num, 5));
        
    }
}