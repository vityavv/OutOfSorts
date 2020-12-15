import java.util.Random;
public class VTest {
	public static void main(String[] args) {
		Random rng = new Random();
		int[] randArr = randArray(rng);
		System.out.println("Not sorted: ");
		System.out.println(!checkSorted(randArr));
		System.out.println("Sorting");
		Sorts.bubbleSort(randArr);
		System.out.println("Sorted: ");
		System.out.println(checkSorted(randArr));
	}
	public static boolean checkSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1]) return false;
		}
		return true;
	}
	public static int[] randArray(Random rng) {
		int[] arr = new int[Math.abs(rng.nextInt() % 1000)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rng.nextInt();
		}
		return arr;
	}
}
