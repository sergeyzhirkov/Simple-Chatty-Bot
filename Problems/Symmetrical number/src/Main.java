import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year%10==year/1000 && year/10%10==year/100%10) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}