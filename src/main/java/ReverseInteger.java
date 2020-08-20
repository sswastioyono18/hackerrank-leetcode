import java.math.BigInteger;

class ReverseInteger {
    public int reverse(int x) {
        boolean negative = false;
        if (x == Integer.MIN_VALUE){
            return 0;
        }
        if (x < 0) {
            x = Math.abs(x);
            negative = true;
        }

        int length = (int) (Math.log10(x));
        long result = 0;
        for (int i = 0; i <= length; i++) {
            int numberOfZeroDigit = (int) Math.pow(10, length - i);
            int digitAtIndexI = x / numberOfZeroDigit;
            int multiplier = (int) Math.pow(10, i);


            result += (long)digitAtIndexI * (long)multiplier;
            if (result > Integer.MAX_VALUE || result * -1 < Integer.MIN_VALUE) {
                return 0;
            }
            x = (int) (x - digitAtIndexI * Math.pow(10, length - i));
        }
        if (negative) {
            result = result * -1;
        }
        return (int) result;
    }


    public static void main(String[] args){
        ReverseInteger rvs = new ReverseInteger();
        rvs.reverse(1563847412);
    }
}