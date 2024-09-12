public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int iterations = 0;

        while (n != 0) {
            if (n % 2 == 1) {
                n--;
                iterations++;
            } else if (n % 2 == 0) {
                n = n / 2;
                iterations ++;
            }
        }

        System.out.println(iterations);
    }
}
