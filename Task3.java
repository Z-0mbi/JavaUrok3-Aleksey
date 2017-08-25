import java.util.Scanner;

/*
 * 
 */
public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//Задаем границы значений в массиве
		System.out.println("Задайте границы значений в массиве:");
		int[] a = new int[2];
		int j = 0;
		while (j < 2) {
			if (sc.hasNextInt()) {
				a[j] = sc.nextInt();
				j++;
			}
			else {
				System.out.println("Не коректный ввод");
				return;
			}
		}
		//Проверяем какое число больше
		if (a[1] < a[0]) {
			a[0] = a[0] - a[1];
			a[1] = a[1] + a[0];
			a[0] = a[1] - a[0];
		}
		
		
		// Создаем массив и заполняем его значениями
		int[] mas = new int[10];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random()*(a[1] - a[0]) + a[0]);
		}
		
		
		// Проверяем наличие значения
		System.out.println("Введите значение");
		if (sc.hasNextInt()) {
			int myValue = sc.nextInt();			

			if (myValue > a[0] && myValue <= a[1]) {
			    for (int i : mas) {
			    	if (i == myValue) {
			    		System.out.println(myValue + " присутствует в массиве");
			    		return;
			    	}			    	
			    }
			    System.out.println(myValue + " Не присутствует в массиве");
			}
			else {
				System.out.println(myValue + " Не присутствует в массиве");
			}
		}
		else {
			System.out.println("Не коректный ввод");
			return;
		}
		
		



	}

}
