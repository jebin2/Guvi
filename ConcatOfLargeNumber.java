import java.util.Scanner;

public class ConcatOfLargeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println(0);
		} else {
			int temp, k = 0;
			int[] a = new int[n];
			StringBuilder sb = new StringBuilder();
			System.out.println("Enter the number one by one");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				sb.append(a[i]);
				if ((i + 1) % 3 == 0 && (i + 1) != n) {
					sb.append(",");
				}
			}
			System.out.println(sb.reverse().toString());
		}
	}

}