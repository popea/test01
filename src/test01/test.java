package test01;

import test01.mijloaceLocomotoare.*;
import java.util.Scanner;

public class test {

	static int  val4;
	static int val5=78;
	static boolean isSmth;
	static double rezervaBenzina;
	static String text1 = "hello, am text";
	static Componenta1 comp1;
	static boolean debug = false;
	
	public static void main(String [] args) {
//		testBasicTypes();
//		testObiecte();
//		testTest2();
		test tt = new test();
//		tt.testStatements();
//		tt.printPrimesUpTo();
//		tt.scanString();
//		tt.printUnaryMatrix();
//		tt.printUnaryMatrix_try2();
	}
	
	
	public boolean isPrime(int input) {
		for (int i =2; i<=input/2; i++) 
		{
			if(input%i==0) return false;//is not a prime
		}
		
		return true;//is a prime
	}

	
	
	public boolean isVoul(char input)
	{
		if (input == 'a' || 
				input == 'e' ||
						input == 'i' ||
								input == 'o' ||
										input == 'u')
		return true;
		else return false;
	}
	
	public void printUnaryMatrix()
	{
		int [][] a = new int[10][10];
		for(int i=0; i<10;i++)
			for(int j=0; j<10; j++)
			{
				if(i==j) a[i][j] = 1;
				else a[i][j] = 0;
			}
		for(int i=0; i<10;i++)
		{	for(int j=0; j<10; j++)
			{
				System.out.print(a[i][j] + " ");
			}
		System.out.print("\n");
		}
		
	}
	public void printUnaryMatrix_try2()
	{
		for (int i = 0; i<100; i++)
		{
			if((i == 0) || (i%11==0)) System.out.print("1 ");
			else System.out.print("0 ");
			if ((i%10==9))  System.out.print("\n");
		}	
	}
	
	public void arrayTests()
	{
		int aray[] = new int[10];
		Vehicul [] garaj = new Vehicul[3];
		for (Vehicul i : garaj) {
			i = new Vehicul(2,5,4,"Trabant");
		}
	}
	
	
	public void scanString() {
//		/citesc un rand de la keyboard.
	// cate vocale sunt, cate litere, cate cuvinte.
		//printout info astea.
		char c;
		Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine().toLowerCase().trim();
		int nrWords=0;
		int nrVouls=0;
		int nrLetters=0;
		for (int i=0;i<line.length(); i++) {
			nrLetters++;	
			if(line.charAt(i) == ' ') {nrWords++;nrLetters--;}
			if(isVoul(line.charAt(i))) ++nrVouls;
			}
		
		System.out.println("nr vocale: "+nrVouls+"\nnr litere:" +nrLetters+
				"\nnr cuvinte:"+(nrWords+1));
		System.out.format("nr vocale: %d,\nnr litere %d,\nnr cuvinte %d;",
				nrVouls, nrLetters, nrWords+1);
		
//		keyboard.next(arg0)
		
		
	}
	
	
	public void printPrimesUpTo()
	{
		Scanner keyboard = new Scanner(System.in);
		int a =keyboard.nextInt();

		for(int j=a; j>= 2; j--)
		{
			System.out.print((isPrime(j))?j + " is prime\n":"");
		}
	}
	
	public void testSwitchs() {
		int varsta =31;
		switch (varsta) {
		case 31: System.out.println("Slava, har");
		case 34: System.out.println("Slava, har");
		case 2: System.out.println("gugugagag");return;
		case 33: System.out.println("Slava, har");
		default:System.out.println("ai " + varsta + " de ani");
			break;
		}
		
	}
	
	
	public void testStatements() {
		Scanner keyboard = new Scanner(System.in);
//		System.out.println("enter sometext (max 3 wurdsa");
//		String variabila = keyboard.nextLine();
//		System.out.println("ai scirs: " + variabila);
//		System.out.println("mai baga o fisa");
//		String variabila3 = keyboard.nextLine();
////		String allInputs [] = variabila + " " + variabila1 + variabila2 + variabila3;
//		System.out.println("solved the bug, bby ;)\nAi scris: " + variabila3);
//		System.out.println("nuemle tau: "+  keyboard.next() +" varsta ta: "  + keyboard.next() );
	System.out.println("Ce inaltime ai?");
	
	if(keyboard.hasNextInt()) {System.out.println("ai " + keyboard.nextInt() + " cm");}
	else if(keyboard.hasNextFloat()) {System.out.println("ai " + keyboard.next() + " m");}
	else if(keyboard.hasNextLine()) {System.out.println("ai inaltimea :" + keyboard.nextLine() );}
	}
	public static void setDebugMode() {
		debug = !debug;
		System.out.println("debug mode is " + debug);
	}
	
	public static int adunare(int a, int b) {
		if(debug) {	
		System.out.println("rezultatul adunarii lui " + a + 
					" la " +b + " ëaste "+(a+b));}
			return a+b;
	}
	public static int scadere(int a, int b) {
		if (debug) {
			System.out.println("rezultatul scaderii lui " + a + " din " + b + " ëaste " + (a - b));
		}
		return a-b;
}
	public static int diviziune(int a, int b) {
		if (debug) {
			System.out.println("catul impartirii lui " + a + " la " + b + " ëaste " + (a / b));
		}
		return a/b;
}
	public static int rest(int a, int b) {
		if (debug) {
			System.out.println("restul impartirii lui " + a + " la " + b + " ëaste " + (a % b));
		}
		return a%b;
}
	public static int patrat(int a) {
		if (debug) {
			System.out.println("patratul lui " + a + " ëaste " + (a * a));
		}
		return a*a;
}
	public static void testBasicTypes() {
		val4 = 2;
		int adunare = adunare(val4, val5);
		int scadere = scadere(val4, val5);
		int diviziune = diviziune(val4, val5);
		int rest = rest(val4, val5);
		int patrat = patrat(val4);
		System.out.println(
				"Numerele mele sunt: " +val4+" "+val5 +"\n"+
				"Rezultatele sunt: \n" +
				"adunare "+ adunare +"\n"+
				"scadere "+ scadere +"\n"+
				"diviziune "+ diviziune +"\n"+
				"rest "+ rest+"\n"+
				"patrat "+ patrat
				);
//		setDebugMode();
//		adunare(val4, val5);
		
	}
	public static void testTest2() {
		test2 test = new test2();
		test.getTest();
		
	}
	
	public static void testObiecte() {
		Masina myOdi = new Masina(2,4,5,2,1, "Odi");
		Avion myBiplane = new Avion(2,2,0,4, "Biplan");
		Submarin mySub = new Submarin();
		myOdi.setBord(1, 2, 3);
		Masina myDacia = new Masina(4,4,5,2,1, "Dasie");
		Masina myFabia = new Masina(4,4,5,2,1, "Fobie");
		myDacia.setRoti(2);
		myFabia.setRoti(5);
		System.out.println(myOdi+ "\n"+myDacia+ "\n" +myFabia+ "\n");
		Masina.setNrPasageri(6);
		System.out.println(myDacia.getNrPasageri());
		System.out.println(myFabia.getNrPasageri());
		System.out.println(myOdi.toString());
		System.out.println(myBiplane.toString());
		System.out.println(mySub.toString());
		myOdi.setNrMotoare(2);
		System.out.println(myOdi.toString());
		Componenta1 a = Componenta1.getInstace();
		
		
	}
	
}
