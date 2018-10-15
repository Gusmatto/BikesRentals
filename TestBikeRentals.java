package Bikes;

public class TestBikeRentals {

	public static void main(String[] args) {
		
		BikeRentals mirenta = new BikeRentals();
		int total = mirenta.getByDay(3);
		System.out.println("El total del alquiler por día es " + total + "$.");
		total = mirenta.getByHour(3);
		System.out.println("El total del alquiler por horas es " + total + "$.");
		total = mirenta.getByWeek(2);
		System.out.println("El total del alquiler por mes es " + total + "$.");
		
		BikeRentals mipromo = new BikeRentals();
		double promo = mipromo.getPromo("week", 5);
		System.out.println("El total de la promo es " + promo + "$.");
		
		
	}
	
}