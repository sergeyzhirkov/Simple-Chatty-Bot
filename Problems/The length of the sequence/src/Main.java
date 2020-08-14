import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        int count = 0;
        do {
            if (scanner.nextInt() != 0) {
                count++;
            } else {
                b = false;
            }
        } while (scanner.hasNext() && b);
        System.out.println(count);
    }
}