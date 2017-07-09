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
/**
 * stack frame for mystery method(loc vars, assign first implies show first)
 *
 * inputArray     	k 	x 	answer 	index
 * [3, 0, 4, 6, 3]  2 	4   2		3
 * 						3 	4		4
 * 									5
 *
 * So, answer is 4.
 *
 * Return the index of the smallest element after or at index k in array inputArray.
 */

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
/**
 * Sort an array in increasing order.
 */


/**
 * Return the n-th Fibonacci number, for n ≥ 0.
 * @param  n the n-th item of a Fibonacci sequence
 * @return   the n-th Fibonacci number
 */
public static int fib(int n) {
	if(n == 0) {
		return 0;
	} else if(n == 1) {
		return 1;
	} else {
		return fib(n - 1) + fib(n - 2);
	}
}

/**
 * Whiltebox testing
 * Basic cases:
 * 	n = 0, 1 
 * Inductive cases():
 * 	n = 5
 */
// Tests pass.

/**
 * The worst-case running time of algorithom fib is Θ(n*lgn).(树形递归)
 * Θ(n*lgn) > Θ(n) > Θ(lgn)
 */

/**
 * Return the n-th Fibonacci number, for n ≥ 0.
 * i.e. The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * @param  n  the n-th item of a Fibonacci sequence
 * @param  k  the start index
 * @param  f0 the first item of the sequence
 * @param  f1 the second item of the sequence
 * @return    the n-th Fibonacci number
 */
public static int fib2(int n, int k, int f0, int f1) {
    int fn_2 = f0;
    int fn_1 = f1;
    int f_n = 0;

    if(n == 0) {
        f_n = f0;
    } else if(n == 1) {
        f_n = f1;
    }

    for(int i = k + 2; i <= n; i++) { // initial index + 2 = 2，从第二项开始迭代
        // iterative operations
        f_n = fn_1 + fn_2;
        fn_2 = fn_1;
        fn_1 = f_n;
    }

    return f_n;
}
/**
 * Procedure fib2 runs in Θ(n) so to be faster than Θ(n*lgn).
 */

/**
 * Whitebox testing
 * Basic cases:
 * 	n = 0, 1
 * Inductive case:
 * 	n = 5
 */
// Tests pass.

