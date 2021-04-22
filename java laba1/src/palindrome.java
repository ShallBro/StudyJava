public class palindrome {
    public palindrome() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < args.length; ++i) {
            String s = args[i];
            System.out.println(s + " - " + isPalindrome(s));
        }

        System.out.println();
    }

    public static String reverseString(String str) {
        String revStr = "";

        for(int i = str.length() - 1; i >= 0; --i) {
            revStr = revStr + str.charAt(i);
        }

        return revStr;
    }

    public static boolean isPalindrome(String str) {
        String revStr = reverseString(str);
        return revStr.equals(str);
    }
}
