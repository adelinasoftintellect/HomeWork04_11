import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = input.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0, c = 0; i < n; i++) {
			for (int j = 0; j < n; j++, c++) {
				a[i][j] = c + 1;
			}
		}
		for (int i = 0, c = 1; i < n; i++) {
			for (int j = 0; j < n; j++, c++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println(); 
		}
	}
}
