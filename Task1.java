/* Найти максимальный элемент в массиве, который содержит
 * произвольные значения из отрезка [1,10] 
 */
public class Task1 {

	public static void main(String[] args) {
		
		
		// Создаем массив и заполняем его значениями
		int[] mas = new int[10];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random()*9 + 1);
		}	
		//Находим максимальный элемент		
		int max = mas[0];
		
		for (int i : mas) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println("Максимальное число " + max);				
		
	}

}
