import java.util.Scanner;

/* Найти сумму элементов массива кратных а или b,
 * где a и b вводятся с клавиатуры. 
 */
public class Task6 {

	public static void main(String[] args) {
		
		// Создаем массив и заполняем его значениями
		int[] mas = new int[10];
				
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random()*1000);
		}
		
		//Вводим делители
		System.out.println("На какие числа будем проверять кратность?");
		Scanner sc = new Scanner(System.in);
		int[] divisors = new int[2];
		for (int i = 0; i < 2; i++ ) {
			if (sc.hasNextInt()) {
			    divisors[i] = sc.nextInt();
			}
			else {
				System.out.println("Не коректный ввод");
			}
		}
		
		//Находим сумму
		int sum = 0;
		for (int i : mas) {
			if ((i%divisors[0] == 0) || (i%divisors[1] == 0)) {
				sum += i;
			}
		}
		
		System.out.println("Cумма чисел кратных " + divisors[0] + " или " + divisors[1] + " = " + sum);

	}

}
