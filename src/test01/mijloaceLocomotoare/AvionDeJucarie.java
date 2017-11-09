package test01.mijloaceLocomotoare;

public class AvionDeJucarie extends Avion{
	private int aripiDeJucarie;
	public void setAripideJucarie()
	{
		this.aripiDeJucarie =2;
	}
	
	protected AvionDeJucarie() {
		super();
	}

	protected AvionDeJucarie(int nrRoti, int nrScaune, int nrUsi, int aripi, String numeVehicul) {
		super(nrRoti, nrScaune, nrUsi, aripi, numeVehicul);
		aripi = 2;
	}

	
	
}
