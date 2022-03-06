public class consecutivestr {
    public static String longestConsec(String[] strarr, int k) {
        int result_length = 0;
        String evalstr = "";
        String result = "";
        for (int i = 0; i < strarr.length - k + 1; i++) {
            for (int j = 0; j < k; j++) {
                evalstr += strarr[i + j];

                if (evalstr.length() > result_length) {
                    result_length = evalstr.length();
                    result = evalstr;
                }
            }
            evalstr = "";
        }
        return result;
    }

    public static void main(String[] args) {
        String[] a = { "hello", "world", "my", "friend" };
        System.out.println(longestConsec(a, 2));
    }
}
