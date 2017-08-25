/* Создать массив и заполнить его цветами радуги. 
 * Написать код, переворачивающий этот массив.
 */
public class Task2 {

	public static void main(String[] args) {
		// Цвета радуги
		String[] rainbow = {"red", "orange", "yellow", "green", "light blu", "blu", "purple"};
        
		//Переворачиваем массив
		String x = "";
		for (int i = 0; i < rainbow.length/2; i++) {
        	x = rainbow[i];
        	rainbow[i] = rainbow[rainbow.length - i - 1];
        	rainbow[rainbow.length - i - 1] = x;
        }
		
		for (String i : rainbow) {
			System.out.print(i + "\t");
		}
	}

}
