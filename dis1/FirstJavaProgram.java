/**
 * varrible type variable name = variable value
 */
int size = 27; // assign int value 27 to size
String name = "Fido"; // assign string value Fido to name
Dog myDog = new Dog(name, size); // Initialize an object myDog of Dog type with parameters name & size 
int x = size - 5; // set int x to size minus 5 

/**
 * if (condition test) {
 * 	statements
 * }
 */
if (x < 15) { // if x is less that 15
	myDog.bark(8); // myDog call bark method with argumnet 8
}

/**
 * while (condition test) {
 * 	statements to be iterate
 * }
 */
while (x > 3) { // while x is large than 3
	x -= 1; // x equals x minus 1
	myDog.play(); // myDog call play method 
} // continue the last two statements until x is less or equal to 3

int[] numList = {2, 4, 6, 8}; // intialize an array numList of int type with 4 values
System.out.print("Hello "); // the console print out a value of string type 
System.out.println("Dog: " + name); // the console print out a string concatenated with name 

System.out.println(numList[1]); // the console print out the second item of numList

if (numList[3] == 8) { // if the fourth item of numList is equal to 8
	System.out.println("potato"); // the console print out a string value
}
