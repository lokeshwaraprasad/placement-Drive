public class PhoneExtract {
    public static void main(String[] args) {
        String input = "+91-98765 43210";

        String phone = input.replaceAll("[^0-9]", "");

        System.out.println(phone); // 919876543210
    }
}
