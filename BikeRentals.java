package Bikes;

public class BikeRentals {
	
	private int byHour = 5;
	private int byDay = 20;
	private int byWeek = 60;
	private double porcentaje = .3;
	private double discount;
	private double promo;
	
	
	public BikeRentals() {
		
	}
	
	public int getByHour(int rentals) {
		int total = rentals * byHour;
		return total;
			
	}
	
	public int getByDay(int rentals) {
		int total = rentals * byDay;
		return total;
		
	}
	
	public int getByWeek(int rentals) {
		int total = rentals * byWeek;
		return total;
		
	}
	
	public double getPromo(String tipo, double rentals) {
		if (rentals > 2 && rentals < 6)
			
			if (tipo == "hour") {
				discount = (byHour * rentals) * porcentaje; 
				promo = (byHour * rentals) - discount;
					
		}	
			if (tipo == "day") {
				discount = (byDay * rentals) * porcentaje;
				promo = (byDay * rentals) - discount;
						
		}
			if (tipo == "week") {
				discount = (byWeek * rentals) * porcentaje;
				promo = (byWeek * rentals) - discount;
		}
				
		return promo;
			
		}
		}
		

	

