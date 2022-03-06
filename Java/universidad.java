public class universidad {
    public static boolean isPrefix(String a, String b) {

        if (a != null && b != null) {
            if (a.length() <= b.length()) {

                if (a == "") {
                    return true;
                } else {
                    if (a.charAt(0) == b.charAt(0)) {
                        return isPrefix(a.substring(1), b.substring(1));
                    } else {
                        return false;
                    }
                }
            } else {
                ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String element1 = "remursi";
        String element2 = "recursion";

        System.out.println(isPrefix(null, null));
    }
}
