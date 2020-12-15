public class Sorts {
	public static void bubbleSort(int[] data) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i] > data[i+1]) {
					sorted = false;
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}
		}
	}
}
