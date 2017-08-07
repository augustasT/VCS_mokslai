package main;

import laivai.Laivas;
import laivai.LaivuOrientacija;

public class MusisMain {
	private int laivuSkaicius;
	Laivas laivasObject;

	public static void main(String[] args) {

	}

	public int gautiLaivuSkaiciu() {
		return laivuSkaicius;
	}

	public Laivas padetiHorizontaluLaiva(int ilgis, int x, int y, LaivuOrientacija orientacija) {
		if (x + ilgis <= 10) {
			laivuSkaicius++;
			laivasObject = new Laivas(ilgis, x, y, orientacija);
			laivasObject.nustatykGaloKoordinates();
		}
		return laivasObject;
	}

	public Laivas padetiVertikaluLaiva(int ilgis, int x, int y,LaivuOrientacija orientacija) {
		if (y + ilgis <= 10) {
			laivuSkaicius++;
			laivasObject = new Laivas(ilgis, x, y, orientacija);
			laivasObject.nustatykGaloKoordinates();
		}
		return laivasObject;
	}

}
