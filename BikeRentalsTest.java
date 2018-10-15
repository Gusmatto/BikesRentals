package Bikes;

import static org.junit.Assert.*;

import org.junit.Test;

public class BikeRentalsTest {

	@Test
	public void testHour() 
	{
		BikeRentals hora = new BikeRentals();
		int total = hora.getByHour(2);
		assertEquals(2 * 5, total, 0);
	}
	
	public void testDay() 
	{
		BikeRentals dia = new BikeRentals();
		int total = dia.getByDay(3);
		assertEquals(3 * 20, total, 0);
	}
	
	public void testWeek()
	{
		BikeRentals semana = new BikeRentals();
		int total = semana.getByWeek(4);
		assertEquals(4 * 60, total, 0 );
	}
	
	public void testPromo()
	{
		BikeRentals promo = new BikeRentals();
		double total = promo.getPromo("day", 3);
		assertEquals((5 * 3) - .3, total, 0);
	}
	
	}
	
	


