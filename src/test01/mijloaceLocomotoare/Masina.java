package test01.mijloaceLocomotoare;

public class Masina extends Vehicul {
private int stergatoare =2 ;
private int motor=1;
public static int nrPasageri = 4;

@Override
public String toString() {
	if (this.motor >1) 
	return super.toString() + " - e masina cu " + 
			stergatoare + " stergatoare si " + motor + " motoare";
	else 
		return super.toString() + " - e masina cu " + 
		stergatoare + " stergatoare si " + motor + " motor";
}

public void setNrMotoare(int cateMotoare) {
	if (cateMotoare >1)
	{System.out.println("Vreau sa am alt nr de motoare in Odi!");
		this.motor = cateMotoare;}
	if (cateMotoare <=0)
		System.out.println("Nu poti avea mai putin de 1 motor in Odi!");
	if(cateMotoare ==1)
		{System.out.println("Vreau sa am un singur in Odi!");
	this.motor = cateMotoare;}
	}
public Masina(int nrRoti, int nrScaune, int nrUsi, int stergatoare, int motor, String numeVehicul) {
	super(nrRoti, nrScaune, nrUsi, numeVehicul);
	System.out.println("constructor masina 4 arg");
	this.stergatoare = stergatoare;
	this.motor = motor;
}
public Masina() {
	super();
}

public void setRoti(int nrRoti) {
	this.roti = nrRoti;
	}

public static int getNrPasageri() {
	return nrPasageri;
}

public static void setNrPasageri(int nrPasageri) {
	Masina.nrPasageri = nrPasageri;
}


}

