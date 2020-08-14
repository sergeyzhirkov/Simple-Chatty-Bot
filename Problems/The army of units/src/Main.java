import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int enemies = scanner.nextInt();
        if (enemies < 1) {
            System.out.println("no army");
        } else if (enemies >= 1 && enemies < 20) {
            System.out.println("pack");
        } else if (enemies >= 20 && enemies < 250) {
            System.out.println("throng");
        } else if (enemies >= 250 && enemies < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}