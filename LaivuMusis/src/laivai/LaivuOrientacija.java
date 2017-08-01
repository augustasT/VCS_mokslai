package laivai;

import laivai.Laivas;

public enum LaivuOrientacija {
	VERTIKALUS(new VertikalusLaivas()), HORIZONTALUS(new HorizontalusLaivas());
	private Laivas laivas;

	LaivuOrientacija(Laivas laivas) {
		this.laivas = laivas;
			
	}

	public Laivas getLaivas() {
		
		return laivas;
	}
}
