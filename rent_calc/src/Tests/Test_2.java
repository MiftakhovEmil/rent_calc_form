package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rent_calc.RentCalc;

class Test_2 {

	@Test
	void test() {
		RentCalc t0; 
		// ןונגûו 5 - עאנטפû, געמנûו 5 - מבתולû
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		
		//test1
		t0 = new RentCalc(34,19.3,21.54,3.25,2, 61,3.3,4.2,1,0.7); 

		assertEquals(2074, t0.total_houseGas); 
		assertEquals(63.69, t0.total_houseHeating); 
		assertEquals(90.47, t0.total_hotWater); 
		assertEquals(3.25, t0.total_coldWater); 
		assertEquals(1.4, t0.total_houseElectricity);
		assertEquals(2232.81, t0.total_sum);
	}

}
