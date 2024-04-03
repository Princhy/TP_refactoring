package iut.bad;

public class Femme extends Humain {
	
	public Femme() {
		super();

	}
	
	public static void main(String[] args) {
        Homme homme = new Homme();
        Femme femme = new Femme();

        femme.ami(homme, 100);
	}

}
