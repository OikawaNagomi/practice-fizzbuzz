import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("開始値を入力してください: ");
        int start = scanner.nextInt();

        System.out.print("終了値を入力してください: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("開始値は終了値以下にしてください。");
            return;
        }

        for (int i = start; i <= end; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}

