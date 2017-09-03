import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NRegisterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println(0);
		} else {
			int key, k = 0;
			for (int i = 0; i < n; i++) {
				key = sc.nextInt();
				if (hm1.get(key) == null) {
					hm1.put(key, i);
				} else {
					hm2.put(key, k++);
				}
			}
			for (Map.Entry<Integer, Integer> m : hm2.entrySet()) {
				System.out.println(m.getKey());
			}
		}
	}

}