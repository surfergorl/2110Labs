package labzero;

public class ArrayOperations {
	 public static void main(String[] args) {
	 int[] numbers = new int[10];
	 // Populate the array with numbers 1 to 10
	 for (int i = 0; i < numbers.length; i++) {
	 numbers[i] = i + 1;
	 }
	 // Display the array
	 System.out.println("Original Array:");
	 for (int i = 0; i < numbers.length; i++) {
	 System.out.print(numbers[i] + " ");
	 }
	 System.out.println();
	 // Calculate and display the sum of the array
	 int totalSum = 0;
	 for (int i = 0; i < numbers.length; i++) {
	 totalSum += numbers[i];
	 }
	 System.out.println("Sum of the Array: " + totalSum);
	 // Reverse and display the array
	 System.out.println("Reversed Array:");
	 for (int i = numbers.length - 1; i >= 0; i--) {
	 System.out.print(numbers[i] + " ");
	 }
	 System.out.println();
	 }

}
