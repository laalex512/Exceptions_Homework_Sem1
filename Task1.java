package Homework1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.FileReader;
import java.io.IOException;

public class Task1 {

	public static void catchArithmeticException(int number) {
		try {
			number = number / 0;
		} catch (ArithmeticException e) {
			System.out.println("catch Arithmetic exception");
		}
	}

	public static void catchNumberFormatException() {
		String line = "13sd";
		try {
			Integer num = Integer.parseInt(line);
		} catch (NumberFormatException e) {
			System.out.println("catch NumberFormatException");
		}
	}

	public static void catchSomeEx() {
		FileReader file = null;
		try {
			file = new FileReader("test");
			file.read();
		} catch (IOException | RuntimeException e) {
			System.out.println("catch exception" + e.getClass().getSimpleName());
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.out.println("catch close exception");
					;
				}
			}
		}
	}
}
