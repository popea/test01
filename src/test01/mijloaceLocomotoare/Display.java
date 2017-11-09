package test01.mijloaceLocomotoare;

public class Display {
protected int viteza;
protected int turatie;
protected int ulei;

public int getViteza() {
	return viteza;
}
public void setViteza(int viteza) {
	this.viteza = viteza;
}
public int getTuratie() {
	return turatie;
}
public void setTuratie(int turatie) {
	this.turatie = turatie;
}
public int getUlei() {
	return ulei;
}
public void setUlei(int ulei) {
	this.ulei = ulei;
}
protected Display(int viteza, int turatie, int ulei) {
	super();
	this.viteza = viteza;
	this.turatie = turatie;
	this.ulei = ulei;
}
protected Display() {
	super();
}


}
