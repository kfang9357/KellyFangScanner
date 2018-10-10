package KellyFang;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What/'s your name? ");
		String name = input.nextLine();
		System.out.println("Hello " + name + ", nice to meet you.");

		Scanner input2 = new Scanner (System.in);
		System.out.print("How old are you?");
		int age = input2.nextInt();
		System.out.println("You are "+age+" years old.");
	}
}
