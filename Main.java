package pl.pgs.tree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);

		System.out.println("Podaj ilosc: ");
		int ilosc = odczyt.nextInt();

		System.out.println("Podaj znak: ");
		String znak = odczyt.next();
		// String znak="x";

		System.out.println("Podaj kierunek ( lewo - left, œrodek - up, prawo - right, dol-down ) : ");
		String kierunek = odczyt.next();
		// String kierunek="right";

		odczyt.close();

		TreeCreator tree = new TreeCreator();

		System.out.println(tree.tree(ilosc, znak, kierunek));

	}

}
