import java.util.Scanner;
public class task1
{
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Число: ");
    int number = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
    if (number > 7) System.out.println("Привет");
    System.out.println();
		
	}
}