package module3.sortarray;

public class SortArray {
	public static void main(String[] args) {
		String[] initialArray = new String[] { "Natasha", "Sveta", "Artem",
				"Michail", "Ivan", "Aliaksei" };
		String[] sortedArray = sortArray(initialArray);

		// print not sorted array
		System.out.println("Initial array: ");
		for (String initialArrayValue : initialArray) {
			System.out.println(initialArrayValue);
		}

		// print sorted array
		System.out.println("\nSorted by string length array: ");
		for (String sortedArrayValue : sortedArray) {
			System.out.println(sortedArrayValue);
		}
	}

	// array elements sorting
	public static String[] sortArray(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].length() > array[j].length()) {
					String tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

}