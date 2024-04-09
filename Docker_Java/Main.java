import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        //Определить количество повторений каждой из цифр 0,1,2,...,9 в числе n!,
        // где n – натуральное число, n>100.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int n = scanner.nextInt();
        double size;

        size = Math.ceil(Math.log10(2 * Math.PI * n) / 2 + n * (Math.log10(n / Math.E)));
        int digitCount = (int) size;

        int[] factorial = new int[digitCount];
        int[] digitOccurrences = new int[10];

        factorial[0] = 1;
        int j, number, remainder;
        for (int i = 2; i <= n; i++) {
            for (j = 0, remainder = 0; j < digitCount; j++) {
                number = factorial[j] * i + remainder;
                factorial[j] = number % 10;
                remainder = number / 10;
            }
        }

        for (j = digitCount - 1; j >= 0; j--) {
            System.out.printf("%d", factorial[j]);
        }

        for (int m = 0; m < factorial.length; m++) {
            digitOccurrences[factorial[m]]++;
        }
        for (int o = 0; o < 10; o++) {
            System.out.println();
            System.out.printf("Цифра - " + o + ", количество - " + digitOccurrences[o]);
        }
        System.out.println();
        scanner.close();
    }
}
