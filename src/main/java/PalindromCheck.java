public class Question2 {

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        System.out.println(q2.isPalindrom("test"));
        System.out.println(q2.isPalindrom("abcba"));
    }

    private boolean isPalindrom(String word) {
        byte[] wordAsByte = word.getBytes();
        byte[] res = new byte[wordAsByte.length];
        for (int i = 0; i< wordAsByte.length ; i++) {
            res[i] = wordAsByte[wordAsByte.length - i -1];
            if (res[i] == word.charAt(i)) {
//                System.out.println("char at " +i+ " is same. res" + String.valueOf(res[i]) + " word.charAt(i) " +word.charAt(i));
            } else {
//                System.out.println("char at " +i+ " is not the same. res" + String.valueOf(res[i]) + " word.charAt(i) " +word.charAt(i));
                return false;
            }
        }
        return true;
    }
}
