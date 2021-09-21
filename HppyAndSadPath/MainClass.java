package HappyandSadPath;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int izbor = 0;

		do {
			System.out.print("Izaberi ociju: \n1)HappyPath\n2)SadPath\n3)Izlaz");
			izbor = s.nextInt();
			switch (izbor) {
			case 1:
				Happy h1 = new Happy();
				h1.test();
				break;
			case 2:
				Sad s1 = new Sad();
				s1.test();
				break;
			case 3:
				System.out.println("Izabrali ste izlaz");
				break;
			default:
				System.out.println("Izaberite opcije 1 do 3");

			}
		} while (izbor != 3);

	}

}
