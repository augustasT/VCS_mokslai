package laivai;

public class Laivas {
	private int ilgis;
	private int xPradzia;
	private int yPradzia;
	protected int xPabaiga;
	protected int yPabaiga;
	
	public Laivas() {
		
	}
	
	public void NustatykKoordinates(int ilgis, int xPradzia, int yPradzia) {
		this.ilgis = ilgis;
		this.xPradzia = xPradzia;
		this.yPradzia = yPradzia;
		
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
		
	}

	
	
}
