import java.util.Random;
// Props to stackoverflow (refereincing https://stackoverflow.com/questions/2186931/java-pass-method-as-parameter)
interface SortInterface {
	void sort(int[] data);
}
public class VTest {

	private static int NUMTESTS = 1000;
	private static int MAXARRSIZE = 1000; //arrays are random length

	public static void main(String[] args) {
		testSort(Sorts::bubbleSort, "Bubble Sort");
		System.out.println();
		testSort(Sorts::selectionSort, "Selection Sort");
		System.out.println();
		testSort(Sorts::insertionSort, "Insertion Sort");
	}
	public static void testSort(SortInterface sort, String name) {
		System.out.println("Testing sort " + name);
		Random rng = new Random();
		for (int i = 0; i < NUMTESTS; i++) {
			int[] randArr = randArray(rng);
			sort.sort(randArr);
			if (!checkSorted(randArr)) System.out.println(name + " failed sorting random arrays");
		}
		int[] backwardsArr = new int[MAXARRSIZE];
		for (int i = 0; i < backwardsArr.length; i++) backwardsArr[i] = 100 - i;
		sort.sort(backwardsArr);
		if (!checkSorted(backwardsArr)) System.out.println(name + " failed sorting a backwards array");
	}
	public static boolean checkSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1]) return false;
		}
		return true;
	}
	public static int[] randArray(Random rng) {
		int[] arr = new int[Math.abs(rng.nextInt() % MAXARRSIZE)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rng.nextInt();
		}
		return arr;
	}
}
