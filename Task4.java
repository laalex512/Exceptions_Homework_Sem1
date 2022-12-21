package Homework1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше

public class Task4 {

	public static Integer[] divideArrays(Integer[] arrayA, Integer[] arrayB) {
		if (arrayA.length != arrayB.length) {
			throw new RuntimeException("Массивы не равны");
		}
		Integer[] resultArray = new Integer[arrayA.length];
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayB[i] == 0){
				throw new RuntimeException("На ноль делить нельзя!");
			}
			resultArray[i] = arrayA[i] / arrayB[i];
		}
		return resultArray;
	}
}
