package test01.mijloaceLocomotoare;

public class Vehicul {
	protected Display bord;
	protected String nume;
	protected int roti =4 ;
	protected int scaune =4 ;
	protected int usi=5;

	@Override
	public String toString() {
//		return super.toString();
		return "Vehiculul " + nume + " cu " + usi + " usi, " + 
		scaune + " scaune si " + roti + " roti\n"+ "Pe bord, displyul arata: "+
		" turatia: " + bord.turatie +
		" ulei: " + bord.ulei +
		" viteza: " + bord.viteza
		;
	}
	public Vehicul(int nrRoti, int nrScaune, int nrUsi, String numeVehicul) 
	{
		System.out.println("constructor vehicul 3 variabile");
		roti = nrRoti;
		scaune = nrScaune;
		usi = nrUsi;
		this.nume = numeVehicul;
		this.bord = new Display();
	}

	public Vehicul(int nrUsi) 
	{
		System.out.println("constructor vehicul 1 variabila");
		usi = nrUsi;
	}
	
	public Vehicul() {System.out.println("constructor vehicul 0 variabile");}
	public Display getBord() {
		return bord;
	}
	public void setBord(int viteza, int turatie, int ulei) {
		this.bord.turatie = turatie;
		this.bord.viteza = viteza;
		this.bord.ulei = ulei;
	}

}
