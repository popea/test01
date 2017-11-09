package test01;

public class Componenta1 {
	
	public static Componenta1 instance = null;

	private Componenta1() {}

	public static Componenta1 getInstace() {
	if (instance == null)
		instance = new Componenta1();
	return instance;
	}
	
}
