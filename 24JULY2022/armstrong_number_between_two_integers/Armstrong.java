package armstrong_number_between_two_integers;

public class Armstrong {
    void armstrongNum(int startRange, long endRange) {
        for (int indexOfDigits = startRange + 1; indexOfDigits < endRange; ++indexOfDigits) {
            int currentDigit = indexOfDigits;
            int totalDigitInNumber = 0;

            while (currentDigit != 0) {
                currentDigit = currentDigit / 10;
                ++totalDigitInNumber;
            }

            int sumOfPowerOfDigits = 0;
            currentDigit = indexOfDigits;

            while (currentDigit != 0) {
                int singleDigit = currentDigit % 10;
                sumOfPowerOfDigits += Math.pow(singleDigit, totalDigitInNumber);
                currentDigit /= 10;
            }

            if (sumOfPowerOfDigits == indexOfDigits)
                System.out.print(indexOfDigits + " ");
        }
    }

    public static void main(String[] args) {
        int firstNumberStartRange = 10;
        long secondNumberEndNumber = 10000000000000000L;
        Armstrong armstrong = new Armstrong();
        armstrong.armstrongNum(firstNumberStartRange, secondNumberEndNumber);
        System.out.println();
    }
}