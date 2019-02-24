package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rent_calc.RentCalc;

class Test_1 {

	@Test
	void test() {
		RentCalc t0; 
		// ןונגûו 5 - עאנטפû, געמנûו 5 - מבתולû
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		
		//test1
		t0 = new RentCalc(15,16,17,18,19,65,54,43,32,21); 

		assertEquals(975, t0.total_houseGas); 
		assertEquals(864, t0.total_houseHeating); 
		assertEquals(731, t0.total_hotWater); 
		assertEquals(576, t0.total_coldWater); 
		assertEquals(399, t0.total_houseElectricity); 
		assertEquals(3545, t0.total_sum);
	}

}
