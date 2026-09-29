import java.util.Scanner;

class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter delayed days: ");
        int days = sc.nextInt();

        int penalty = days * 2;

        System.out.println("Penalty = ₹" + penalty);
    }
}