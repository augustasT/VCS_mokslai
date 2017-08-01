package laivai;

public class HorizontalusLaivas extends Laivas{

	public HorizontalusLaivas() {
		
	}
	@Override
	public void nustatykGaloKoordinates() {
		super.xPabaiga = super.gaukXkoordinate() + super.gaukIlgi();
		super.yPabaiga = super.gaukYkoordinate();
	}
	
	
}
