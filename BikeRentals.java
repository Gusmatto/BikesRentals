package Bikes;

//Programa que calcula el alquiler de bicicletas, dependiendo de si es por hora, día, semana o una promo familiar.

public class BikeRentals {
	
	private int byHour = 5;
	private int byDay = 20;
	private int byWeek = 60;
	private double porcentaje = .3;
	private double discount;
	private double promo;
	
	//Constructor
	public BikeRentals() {
		
	}
	//Métodos de cálculo según tipo de alquiler
	
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
	//Método para calcular la promo familiar
	
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
		

	

