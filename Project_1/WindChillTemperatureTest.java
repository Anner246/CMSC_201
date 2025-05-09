import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WindChillTemperatureTest
{
	static double temp;
	static double speed;
	static double windChill;
	static double v;
	final static double FIRSTCOEFFICIENT = 35.74;
	final static double SECONDCOEFFICIENT = 0.6215;
	final static double THIRDCOEFFICIENT = 35.75;
	final static double FOURTHCOEFFICIENT = 0.4275;
	final static double FIFTHCOEFFICIENT = 0.16;
	
	@BeforeEach
	void setUp() throws Exception
	{
		temp = 0.0;
		speed = 0.0;
		windChill = 0.0;
		v = 0.0;
	}
	
	@AfterEach
	void tearDownAfterClass() throws Exception
	{
		temp = 0.0;
		speed = 0.0;
		windChill = 0.0;
		v = 0.0;
	}
	
	@Test
	void testMain()
	{
		temp = 5.3;
		speed = 6;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		windChill = WindChillTemperature.roundUpToFiveDigits(windChill);
		assertEquals(-5.56707, windChill);
		
		temp = 15.5;
		speed = 2.2;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		windChill = WindChillTemperature.roundUpToFiveDigits(windChill);
		assertEquals(12.33364, windChill);
		
		temp = 20.0;
		speed = 4.3;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		windChill = WindChillTemperature.roundUpToFiveDigits(windChill);
		assertEquals(13.82023, windChill);
		
		temp = 30.7;
		speed = 3.4;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		windChill = WindChillTemperature.roundUpToFiveDigits(windChill);
		assertEquals(27.30061, windChill);
		
		temp = 40.5;
		speed = 5.5;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		windChill = WindChillTemperature.roundUpToFiveDigits(windChill);
		assertEquals(36.69318, windChill);
	}
	
	@Test
	void testRoundUpToFiveDigits()
	{
		temp = 5.3;
		speed = 6;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		assertEquals(-5.56707, WindChillTemperature.roundUpToFiveDigits(windChill));
		
		temp = 15.5;
		speed = 2.2;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		assertEquals(12.33364, WindChillTemperature.roundUpToFiveDigits(windChill));
		
		temp = 20.0;
		speed = 4.3;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		assertEquals(13.82023, WindChillTemperature.roundUpToFiveDigits(windChill));
		
		temp = 30.7;
		speed = 3.4;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		assertEquals(27.30061, WindChillTemperature.roundUpToFiveDigits(windChill));
		
		temp = 40.5;
		speed = 5.5;
		v = Math.pow(speed, FIFTHCOEFFICIENT);
		windChill = (FIRSTCOEFFICIENT + SECONDCOEFFICIENT*temp - THIRDCOEFFICIENT*v + FOURTHCOEFFICIENT*temp*v);
		assertEquals(36.69318, WindChillTemperature.roundUpToFiveDigits(windChill));
	}
	
}
