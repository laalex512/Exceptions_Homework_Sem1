package Homework1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности  элементов
// двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task3 {

	public static Integer[] averageArrays(Integer[] arrayA, Integer[] arrayB) {
		if (arrayA.length != arrayB.length) {
			throw new RuntimeException("Массивы не равны");
		}
		Integer[] resultArray = new Integer[arrayA.length];
		for (int i = 0; i < arrayA.length; i++) {
			resultArray[i] = arrayA[i] - arrayB[i];
		}
		return resultArray;
	}
}
