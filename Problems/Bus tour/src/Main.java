import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean flag = true;

        for (int i = 1; i <= bridges; i++){
            int a = scanner.nextInt();
            if (a <= height) {
                System.out.println("Will crash on bridge " + i);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Will not crash");
        }
    }
}
