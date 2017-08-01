package test;

import org.junit.Test;

import laivai.Laivas;
import main.MusisMain;

import org.junit.Assert;

public class MusisTest {
	MusisMain musisObject = new MusisMain();

	@Test
	public void tikrinamArLaivuYraNulis() {

		Integer kiekis = musisObject.gautiLaivuSkaiciu();

		Assert.assertTrue(kiekis == 0);

	}

	@Test
	public void tikrinamArPoPadejimoLaivuYraVienas() {
		musisObject.padetiHorizontaluLaiva(3, 2, 3);
		Integer kiekis = musisObject.gautiLaivuSkaiciu();
		Assert.assertTrue(kiekis == 1);

	}

	@Test
	public void tikrinamKokiLaivaPridejom() {
		Laivas pirmasLaivas =  musisObject.padetiHorizontaluLaiva(3, 2, 3);
		Assert.assertTrue(pirmasLaivas.gaukIlgi() > 0);

	}

	@Test
	public void tikrinamaArTeisingaiPriskirtosKoordinates() {
		Laivas antrasLaivas =  musisObject.padetiHorizontaluLaiva(4, 1, 1);
		Assert.assertTrue(antrasLaivas.gaukXkoordinate() == 1 && antrasLaivas.gaukYkoordinate() == 1);
	}

	@Test
	public void tikrinamaLaivoOrientacija() {
		Laivas antrasLaivas = musisObject.padetiHorizontaluLaiva(4, 1, 1);
		Assert.assertTrue(antrasLaivas!=null);
	}
	
	@Test
	public void tikrinamaArKoordinatesNeiseinaUzLentosRibu() {
		
		Laivas antrasLaivas =  musisObject.padetiHorizontaluLaiva(4, 4, 1);
		Assert.assertTrue(antrasLaivas != null);
	}

}
