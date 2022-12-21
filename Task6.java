package Homework1;

//Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.
// Как бы вы реализовали подобный метод.

public class Task6 {

	public static boolean isConditionMet(Integer[][] initArray) {
		boolean isTrue = true;
		for (int i = 0; i < initArray.length; i++) {
			int countingInColumn = 0 ;
			for (int j=0; j< initArray.length; j++){
				try {
					countingInColumn = initArray[j][i] * 0 + ++countingInColumn;
				} catch (IndexOutOfBoundsException e){
				}
			}
			if (countingInColumn != initArray[i].length){
				return false;
			}
		}
		return isTrue;
	}
}
