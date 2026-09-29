import java.util.Scanner;
public class LibraryFine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days late: ");
        int days = sc.nextInt();
        if (days > 0) {
            int fine = days * 5;
            System.out.println("Total Fine: " + fine);
        } else {
            System.out.println("No fine. returned on time.");
        }
    }
}
