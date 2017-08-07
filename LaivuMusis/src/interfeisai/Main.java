package interfeisai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		AplinkaImplementation aplinka = new AplinkaImplementation();

		aplinka.padetiLaiva(3, 2, 2, Kryptis.HORIZONTAL);
		aplinka.gautiLenta();
		
		aplinka.padetiLaiva(3, 2, 2, Kryptis.HORIZONTAL);
		aplinka.gautiLenta();
		
		aplinka.padetiLaiva(3, 2, 2, Kryptis.HORIZONTAL);
		aplinka.gautiLenta();
		
		while (aplinka.patikrinkArYraGyvuLaivu()) {
			aplinka.atspausdinkLenta();
			System.out.println("Ivesk X ir Y");
			aplinka.sauti(scn.nextInt(), scn.nextInt());
		}
		aplinka.atspausdinkLenta();
		scn.close();
		/*s
		 * System.out.println("Padek 4-vieti laiva"); priimkLaivoParametrus(4, 1,
		 * aplinka); System.out.println("Padek 3-vieti laiva"); priimkLaivoParametrus(3,
		 * 2, aplinka); System.out.println("Padek 2-vieti laiva");
		 * priimkLaivoParametrus(2, 3, aplinka);
		 * System.out.println("Padek 1-vieti laiva"); priimkLaivoParametrus(1, 4,
		 * aplinka);
		 * 
		 * aplinka.padetiLaiva(4, 1, 0, Kryptis.HORIZONTAL); aplinka.gautiLenta();
		 * aplinka.padetiLaiva(1, 5, 5, Kryptis.VERTICAL); aplinka.gautiLenta();
		 * aplinka.atspausdinkLenta();
		 */

	}

	/*
	 * public static void priimkLaivoParametrus(int dydis, int kiekis,
	 * AplinkaImplementation aplinka) { Scanner scn = new Scanner(System.in);
	 * 
	 * while (kiekis > 0) { Kryptis kryptis;
	 * System.out.println("Ivesk X koordinate:"); int x = scn.nextInt();
	 * System.out.println("Ivesk Y koordinate:"); int y = scn.nextInt();
	 * System.out.println("Ivesk krypti: Horizontali / Vertikali");
	 * 
	 * switch (scn.next().toLowerCase()) { case "vertikali": kryptis =
	 * Kryptis.VERTICAL; break; default: kryptis= Kryptis.HORIZONTAL;
	 * 
	 * }
	 * 
	 * aplinka.padetiLaiva(dydis, x, y, kryptis); aplinka.gautiLenta();
	 * aplinka.atspausdinkLenta(); kiekis--; }
	 * 
	 * }
	 */

}
