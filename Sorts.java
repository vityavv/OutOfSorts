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
	public static void selectionSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int smallestInd = i;
			for (int j = 0; j < data.length; j++) {
				if (data[j] < data[smallestInd]) smallestInd = j;
			}
			int temp = data[i];
			data[i] = data[smallestInd];
			data[smallestInd] = data[i];
		}
	}
	public static void insertionSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			int temp = data[i];
			int j = i - 1;
			while(data[j] > temp) {
				data[j+1] = data[j];
				j--;
				if (j == -1) break;
			}
			data[j+1] = temp;
		}
	}
}
