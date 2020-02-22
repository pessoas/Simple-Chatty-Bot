import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 1; i <= total; i++) {
            int check = scanner.nextInt();

            if (check == 0) {
                perfect++;
            } else if (check == 1) {
                larger++;
            } else {
                smaller++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}