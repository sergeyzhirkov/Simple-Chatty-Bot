import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int i;
        do{
            i = scanner.nextInt();
            if (i!=0){
                if (i%2==0){
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }
        } while (scanner.hasNext() && i!=0);
    }
}