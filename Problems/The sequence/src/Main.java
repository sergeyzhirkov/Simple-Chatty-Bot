import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (n>0){
            i++;
            for (int j = 0; j < i; j++) {
                if (n>0){
                    System.out.print(i+" ");
                    n--;
                }
            }
        }
    }
}