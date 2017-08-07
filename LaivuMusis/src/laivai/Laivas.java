package laivai;

public class Laivas{
	private int ilgis;
	private int xPradzia;
	private int yPradzia;
	private int xPabaiga;
	private int yPabaiga;
	private LaivuOrientacija orientacija;

	public Laivas(int ilgis, int xPradzia, int yPradzia, LaivuOrientacija orientacija) {
		this.ilgis = ilgis;
		this.xPradzia = xPradzia;
		this.yPradzia = yPradzia;
		this.orientacija = orientacija;
	}

	public int gaukIlgi() {
		return ilgis;
	}

	public int gaukXkoordinate() {
		return xPradzia;
	}

	public int gaukYkoordinate() {
		return yPradzia;
	}

	public void nustatykGaloKoordinates() {
		if (orientacija == LaivuOrientacija.HORIZONTALUS) {
			xPabaiga = xPradzia + ilgis;
			yPabaiga = yPradzia;
		}else {
			yPabaiga = yPradzia + ilgis;
			xPabaiga = xPradzia;
		}
	}
	public LaivuOrientacija gaukOrientacija() {
		return orientacija;
	}
	

}
