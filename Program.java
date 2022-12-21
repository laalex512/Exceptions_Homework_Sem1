package Homework1;

public class Program {

	public static void main(String[] args) {
		Task1.catchArithmeticException(50);
		Task1.catchNumberFormatException();
		Task1.catchSomeEx();

		Integer[] arrayA = {5, 1, 3};
		Integer[] arrayB = {2, 3, 0};

//		printArray(Task3.averageArrays(arrayA, arrayB));

//		printArray(Task4.divideArrays(arrayA, arrayB));

//		printArray(Task5.sumArrays(arrayA, arrayB));

		Integer[][] initArray = {
			 {5, 3, 2},
			 {4, 3, 5},
			 {9}
		};

		System.out.println(Task6.isConditionMet(initArray));

	}

	public static void printArray(Integer[] array) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("{");
		for (int i = 0; i < array.length - 1; i++) {
			sBuilder.append(array[i]).append(", ");
		}
		sBuilder.append(array[array.length - 1]).append("}");
		System.out.println(sBuilder);
	}
}
