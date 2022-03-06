public class tray {
    public static String order(String words) {

        if (words.matches(".*\\d.*")) {
            ;
        } else {
            return words;
        }

        String[] parts = words.split(" ");
        int[] size = new int[parts.length];
        String result = "";
        int temp = 0;

        for (int i = 0; i < parts.length; i++) {
            String num = parts[i].replaceAll("\\D+", "");
            size[i] = Integer.parseInt(num);
        }

        for (int i = 0; i < parts.length; i++) {
            for (int j = i + 1; j < size.length; j++) {
                if (size[i] > size[j]) {
                    temp = size[i];
                    size[i] = size[j];
                    size[j] = temp;
                }
            }
        }

        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts.length; j++) {
                if (parts[j].contains(Integer.toString(size[i]))) {
                    result += parts[j] + " ";
                }
            }
        }

        return result.replaceFirst(".$", "");

    }

    public static void main(String[] args) {
        System.out.println(order(""));
    }
}