/** This is a function (a.k.a. method). It takes an array
* of integers and an integer as arguments, and returns an integer. */
public static int mystery(int[] inputArray, int k) {
	int x = inputArray[k];
	int answer = k;
	int index = k + 1;

	while (index < inputArray.length) {
		if (inputArray[index] < x) {
			x = inputArray[index];
			answer = index;
		}
		index = index + 1;
	}

	return answer;
}

/** Extra for experts. This is another function. It takes an
* array of integers and returns nothing at all. */
public static void mystery2(int[] inputArray) {
	int index = 0;

	while (index < inputArray.length) {
		int targetIndex = mystery(inputArray, index);
		int temp = inputArray[targetIndex];
		
		inputArray[targetIndex] = inputArray[index];
		inputArray[index] = temp;
		index = index + 1;
	}
}