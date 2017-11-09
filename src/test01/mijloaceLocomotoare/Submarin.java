package test01.mijloaceLocomotoare;

public class Submarin extends Vehicul {
	private int paturi = 2;
	public void catePaturi() {
		System.out.println("Acest submarin are "+this.paturi+" paturi");
	
}
	public Submarin(int nrRoti, int nrScaune, int nrUsi, int paturi, String numeVehicul) {
		super(nrRoti, nrScaune, nrUsi, numeVehicul);
		this.paturi = paturi;
		System.out.println("constructor pt submarin 4 arg");
	}
	public Submarin(int nrUsi, int paturi) {
		super(nrUsi);
		this.paturi = paturi;
		System.out.println("constructor pt submarin 2 arg");
	}
	public Submarin() {
		super();
		System.out.println("constructor pt submarin 0 arg");
	}
	@Override
	public String toString() {
		if (roti > 0)
		return "Submarin cu " + paturi + " paturi, foarte multe (" 
				+ roti + ") roti "+ 
				scaune + " scaune "
				+ usi + " usi";
		else return "Submarin cu " + paturi + " paturi, "+
		scaune + " scaune "
		+ usi + " usi";	
	}

	
	
}
