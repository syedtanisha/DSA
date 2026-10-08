import java.util.*;

class TriangleFlippedVertically {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

System.out.print("Enter n value: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

System.out.println("Another Way");
for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}