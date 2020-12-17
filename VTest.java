import java.util.Random;
public class VTest {
	public static void main(String[] args) {
		System.out.println("Bubble sort");
		Random rng = new Random();
		int[] randArr = randArray(rng);
		System.out.println("Not sorted: ");
		System.out.println(!checkSorted(randArr));
		System.out.println("Sorting");
		Sorts.bubbleSort(randArr);
		System.out.println("Sorted: ");
		System.out.println(checkSorted(randArr));

		System.out.println("Selection Sort");
		randArr = randArray(rng);
		System.out.println("Not sorted: ");
		System.out.println(!checkSorted(randArr));
		System.out.println("Sorting");
		Sorts.selectionSort(randArr);
		System.out.println("Sorted: ");
		System.out.println(checkSorted(randArr));
		int[] backwardsArr = new int[100];
		for (int i = 0; i < backwardsArr.length; i++) backwardsArr[i] = 100 - i;
		System.out.println("Not sorted: ");
		System.out.println(!checkSorted(backwardsArr));
		System.out.println("Sorting");
		Sorts.selectionSort(backwardsArr);
		System.out.println("Sorted: ");
		System.out.println(checkSorted(backwardsArr));

		System.out.println("Insertion Sort");
		randArr = randArray(rng);
		System.out.println("Not sorted: ");
		System.out.println(!checkSorted(randArr));
		System.out.println("Sorting");
		Sorts.insertionSort(randArr);
		System.out.println("Sorted: ");
		System.out.println(checkSorted(randArr));
		for (int i = 0; i < backwardsArr.length; i++) backwardsArr[i] = 100 - i;
		System.out.println("Not sorted: ");
		System.out.println(!checkSorted(backwardsArr));
		System.out.println("Sorting");
		Sorts.insertionSort(backwardsArr);
		System.out.println("Sorted: ");
		System.out.println(checkSorted(backwardsArr));
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
