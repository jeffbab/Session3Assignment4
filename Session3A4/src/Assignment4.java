
public class Assignment4 {
	/*
	 * Sort an array and insert an element inside it.
	 * 
	 * Should print the sorted array. Also should print the new array values
	 * after insertion of element.
	 */
	public static void main(String[] args) {

		int[] sortMe = { 11, 12, 42, 3, 44, 191 };
		int[] inserted;
		sortMe = bubbleSort(sortMe);
		
		
		System.out.println("Sorted array: ");
		for (int i : sortMe)
			System.out.print(i + " ");
		
		
		System.out.println("\n\nInsertion of numbers\n==========================\n");
		System.out.println("Insert -5 ");
		
		insert(sortMe, -5);
		System.out.println("\n\nInsert 42 ");
		insert(sortMe, 42);
		System.out.println("\n\nInsert 43 ");
		insert(sortMe, 43);
		System.out.println("\n\nInsert 100 ");
		insert(sortMe, 100);
		System.out.println("\n\nInsert 0 ");
		insert(sortMe, 0);
		System.out.println("\n\nInsert 222 ");
		insert(sortMe, 222);
	}

	/*
	 * Standard bubble sort method
	 * 
	 */
	private static int[] bubbleSort(int[] sortMe) {
		int arrayLength = sortMe.length;
		int holdNumber = 0;

		for (int i = 0; i < arrayLength; i++) {
			for (int j = 1; j < (arrayLength - i); j++) {

				if (sortMe[j - 1] > sortMe[j]) {
					holdNumber = sortMe[j - 1];
					sortMe[j - 1] = sortMe[j];
					sortMe[j] = holdNumber;
				}

			}
		}
		return sortMe;
	}

	/*
	 * simple insertion method
	 */
	private static void insert(int[] theArray, int insertThis) {
		if (insertThis > theArray[theArray.length - 1])
			insertIn(theArray.length, theArray, insertThis);
		for (int i = 0; i < theArray.length - 1; i++) {
			if (i == 0 && (insertThis <= theArray[i]))
				insertIn(0, theArray, insertThis);
			else if (insertThis > theArray[i] && insertThis <= theArray[i + 1])
				insertIn(i+1, theArray, insertThis);
		}

	}

	/*
	 * Helper to keep from blending ideas
	 */
	private static void insertIn(int arrayPosition, int[] array, int insert) {
		int[] displayArray = new int[array.length + 1];

		for (int i = 0; i < arrayPosition; i++)
			displayArray[i] = array[i];

		displayArray[arrayPosition] = insert;

		for (int i = arrayPosition; i < array.length; i++)
			displayArray[i + 1] = array[i];

		for (int i : displayArray)
			System.out.print(i + " ");
	}
}
