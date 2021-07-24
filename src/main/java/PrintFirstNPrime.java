import java.util.ArrayList;
import java.util.List;

// print first N numbers
public class Question1 {

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.printPrimes(4);
    }

    void printPrimes(int input) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (input < 2) {
            primeNumbers.add(2);
            System.out.println(primeNumbers);
            return;
        }

        primeNumbers.add(2);
        for (int i = 3; i < input * 3; i += 2) { // skip over even numbers since they are not prime
            boolean isPrime = true;
            for (Integer prime : primeNumbers) { // check current prime numbers to see if it evenly divides into number
                if (i % prime == 0) { // when number is not prime
                    isPrime = false;
                    break; // optimization: stop checking when number is already not prime
                }
            }
            if (isPrime && primeNumbers.size() < input) {
                primeNumbers.add(i);
            }

            if (primeNumbers.size() == input) {
                break;
            }
        }
        System.out.println(primeNumbers);
    }
}

