package interfeisai;

public class Suvis {

	private int x;
	private int y;
	Laivas laivoObjektas;
	private boolean arSveikas = true;
	private boolean arSuvisNetaiklus = false;

	public Suvis(int x, int y, Laivas laivoObjektas) {
		this.x = x;
		this.y = y;
		this.laivoObjektas = laivoObjektas;

	}

	public void setSuvisNetaiklus() {
		arSuvisNetaiklus = true;
	}

	public int gaukX() {
		return this.x;
	}

	public int gaukY() {
		return this.y;
	}

	public Laivas gaukLaivoObjekta() {
		return this.laivoObjektas;
	}

	public void pasautas(Laivas laivas) {
		arSveikas = false;
		laivas.pasautas();
	}

	public void spausdintiBusena() {
		if (arSveikas && !arSuvisNetaiklus && laivoObjektas != null) {
			System.out.print("[]");
		} else if (arSuvisNetaiklus) {
			System.out.print("O ");
		} else if (!arSuvisNetaiklus && laivoObjektas == null) {
			System.out.print("* ");
		} else {

			System.out.print("X ");
		}
	}

}
