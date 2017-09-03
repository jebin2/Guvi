import java.util.HashMap;
import java.util.Scanner;

public class NRegisterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println(0);
			return;
		}
		int count = 0;
		int key;
		for (int i = 0; i < n; i++) {
			key = sc.nextInt();
			if (hm.get(key) == null) {
				hm.put(key, i);
			} else {
				count++;
			}
		}
		System.out.println(count);
	}

}