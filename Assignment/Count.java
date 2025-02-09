public class Count {
    public static void main(String[] args) {
        int number = 1002009320;
        int count = countZeros(number);

        System.out.println("The number of zeros in " + number + " is: " + count);
    }

    public static int countZeros(int number) {
        int count = 0;

        while (number > 0) {
            if (number % 10 == 0) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
}
