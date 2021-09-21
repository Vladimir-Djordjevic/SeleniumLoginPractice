package HappySadPath;

import java.util.Scanner;

public class MainPath {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int izbor = 0;

		do {
			System.out.print("Izaberi ociju: \n1)Ispravan Login\n2)Neispravan Login\n3)Izlaz");
			izbor = s.nextInt();
			switch (izbor) {
			case 1:
				IspravanLog happy = new IspravanLog();
				happy.login();
				break;
			case 2:
				NeispravanLogin sad = new NeispravanLogin();
				sad.login();
				break;
			case 3:
				System.out.println("Izabrali ste izlaz");
				break;
			default:
				System.out.println("Izaberite opcije 1 do 3");

			}
		} while (izbor != 3);

		System.out.println("App close!");

		s.close();

	}

}
