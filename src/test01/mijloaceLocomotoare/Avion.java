package test01.mijloaceLocomotoare;

public class Avion extends Vehicul {
	private int aripi=2;
	
	public void getRoti() {
		System.out.println("Acest avion are " + this.roti+ " roti");
	}
	
	@Override
	public String toString() {
		return super.toString() + " - e avion cu " + 
		aripi + " aripi";
	}

	public Avion(int nrRoti, int nrScaune, int nrUsi, int aripi,String numeVehicul) {
		super(nrRoti, nrScaune, nrUsi, numeVehicul);
		this.aripi = aripi;
	}

	public Avion() {
		super();
	}


	

}
