package test;

import interfeisai.AplinkaImplementation;
import interfeisai.Kryptis;
import interfeisai.LaivasImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AplinkaImplementationTest {
	
	private AplinkaImplementation aplinka = new AplinkaImplementation();
	
	@Test
	public void arPoPadejimoLaivasYraVienas() {
		aplinka.padetiLaiva(3, 3, 3, Kryptis.HORIZONTAL);		
		Assert.assertTrue(aplinka.gautiGyvuLaivuSkaiciu()==1);
		

	}
	@Test
	public void patikrinameArLaivasPasidedaIMasyva() {
		aplinka.padetiLaiva(3, 3, 3, Kryptis.HORIZONTAL);
		Assert.assertTrue(aplinka.gautiLenta()[3][3] !=null);
	}

	/*
	 * private AplinkaImplementation aplinkaGlobal;
	 * 
	 * @Before public void pradzia() { aplinkaGlobal = new AplinkaImplementation();
	 * }
	 * 
	 * @Test public void tikrinamArPradziojeLaivuYraNulis() { // padetiLaiva(1, 1,
	 * 2); AplinkaImplementation aplinka = new AplinkaImplementation();
	 * 
	 * Integer kiekis = aplinka.gautiLaivuSkaiciu();
	 * 
	 * Assert.assertTrue(kiekis == 0); }
	 * 
	 * @Test public void tikrinamArPoPadejimoLaivuYraVienas() {
	 * AplinkaImplementation aplinka = new AplinkaImplementation();
	 * 
	 * aplinka.padetiLaiva(3, 2, 2,Kryptis.HORIZONTAL);
	 * 
	 * Integer kiekis = aplinka.gautiLaivuSkaiciu();
	 * 
	 * Assert.assertTrue(kiekis == 1); }
	 * 
	 * @Test public void tikrinamKokiLaivaPadejom() { LaivasImplementation
	 * pirmasLaivas = aplinkaGlobal.padetiLaiva();
	 * 
	 * Assert.assertTrue(pirmasLaivas.gautiDydi() > 0); }
	 * 
	 * @Test public void tikrintiArLaivuiPriskyreXirYKoordinates() {
	 * LaivasImplementation pirmasLaivas = aplinkaGlobal.padetiLaiva(4, 2, 2);
	 * 
	 * Assert.assertTrue(pirmasLaivas.gautiX() == 2);
	 * Assert.assertTrue(pirmasLaivas.gautiY() == 2); }
	 * 
	 * @Test public void tikrintiArPaduodamosKoordinatesNeuzeinaUzLentosRibu() {
	 * LaivasImplementation pirmasLaivas = aplinkaGlobal.padetiLaiva(4, 11, 11);
	 * LaivasImplementation antrasLaivas = aplinkaGlobal.padetiLaiva(4, 4, 4);
	 * 
	 * Assert.assertTrue(pirmasLaivas == null); Assert.assertTrue(antrasLaivas !=
	 * null); }
	 */
}
