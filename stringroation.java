public class RotationCount {

    public static int totalRotations(String s, String[] targets) {

        int total = 0;
        String temp = s + s;

        for (String target : targets) {

            if (s.length() != target.length())
                continue;

            int index = temp.indexOf(target);

            if (index != -1 && index < s.length()) {
                total += index;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        String s = "AABCD";

        String[] targets = {
            "ABCDA",
            "BCDAA",
            "CDAAB",
            "DAABC"
        };

        System.out.println(totalRotations(s, targets));
    }
}