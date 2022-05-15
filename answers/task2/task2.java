import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String right_name = "Вячеслав";
		String name = in.nextLine();
		if (name.equals(right_name)) System.out.println("Привет, Вячеслав");
		else System.out.println("Нет такого имени");
		
	}
}