package pl.pgs.tree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);

		
		//System.out.println("Podaj znak: ");
		//String znak = odczyt.nextLine();
		String znak="x";
		
		//System.out.println("Podaj kierunek ( lewo - left, œrodek - up, prawo - right, dol-down ) : ");
		//String kierunek = odczyt.nextLine();
		String kierunek="right";
		
		System.out.println("Podaj ilosc: ");
		int ilosc = odczyt.nextInt();
		
		TreeCreator tree=new TreeCreator();
	
		System.out.println(tree.tree(ilosc, znak, kierunek));
		
		odczyt.close();
		

	}

}
