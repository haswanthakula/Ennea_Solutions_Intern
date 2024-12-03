import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp;
        int sr=n/2;
        do{
            temp=sr;
            sr=(temp+(n/temp))/2;
        }while((temp-sr)!=0);
        System.out.print(sr);
        sc.close();
    }
}