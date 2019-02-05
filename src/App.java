
public class App {

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 7, 8, 11, 15, 81, 99 };
		// System.out.println(binarySearch(a, 8));
		System.out.println(binarySearch(a, 15));

	}

	public static int binarySearch(int[] a, int x) {
		int p = 0;
		int r = a.length - 1;
		while (p <= r) {
			int q = (p + r) / 2;
			if (a[q] > x) {
				r = q - 1;
			} else if (a[q] < x) {
				p = q + 1;
			} else {
				return q;
			}
		}
		return -1;
	}

}
