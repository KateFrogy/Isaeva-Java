import java.util.Scanner;
public class Programm
{
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Размер массива: ");
    int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
    int array[] = new int[size]; // Создаём массив int размером в size
    System.out.println("Элементы массива:");
    /*Пройдёмся по всему массиву, заполняя его*/
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
    }
    System.out.print ("Элементы массива кратные 3:");
    for (int i = 0; i < size; i++) {
        if (array[i]%3 == 0) System.out.print (" " + array[i]);
    }
    System.out.println();
		
	}
}