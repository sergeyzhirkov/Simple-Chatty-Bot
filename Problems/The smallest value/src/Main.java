import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int i = 1;
        long fac = 1;
        while (fac<=m){
            i++;
            fac = fac*i;
        }
        System.out.println(i);
    }
}