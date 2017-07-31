package test;
import org.junit.Test;

import main.MusisMain;

import org.junit.Assert;

public class MusisTest {
	MusisMain musisObject = new MusisMain();

	@Test
	public void tikrinamArLaivuYraNulis() {
		//padetiLaiva(1,1,2);		
		

		Integer kiekis = musisObject.gautiLaivuSkaiciu();
		
		
		Assert.assertTrue(kiekis == 0);
		
	}
	
	@Test
	public void tikrinamArPoPadejimoLaivuYraVienas() {
		musisObject.padetiLaiva();
		Integer kiekis = musisObject.gautiLaivuSkaiciu();
		Assert.assertTrue(kiekis==1);
		
	}
	
}
