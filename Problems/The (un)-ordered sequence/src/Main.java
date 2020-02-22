import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int previous = 0;
        int previous2 = 0;
        int current = scanner.nextInt();
        int numberCount = 0;

        boolean ordered = true;

        while (current != 0) {
            numberCount++;
            if (numberCount == 1) {
                previous2 = current;
                current = scanner.nextInt();
            } else if (numberCount == 2) {
                previous = current;
                current = scanner.nextInt();
            } else {
                //current = scanner.nextInt();
                if ((previous2 <= previous && previous <= current) || (previous2 >= previous && previous >= current)) {
                    previous2 = previous;
                    previous = current;
                    current = scanner.nextInt();
                } else {
                    ordered = false;
                    break;
                }
            }
        }

        System.out.println(ordered);
    }
}
