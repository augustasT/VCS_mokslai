package laivai;

public class VertikalusLaivas extends Laivas {
	public VertikalusLaivas() {

	}

	@Override
	public void nustatykGaloKoordinates() {
		super.yPabaiga = super.gaukYkoordinate() + super.gaukIlgi();
		super.xPabaiga = super.gaukXkoordinate();
	}
}
