package iut.bad;

public class Humain {

	private String nom;
	private String prenom;
	private int age;

    public void details() {
        System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", Age : " + age);
    }

	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	public void ami(Humain humain, int duree) {
		
	}
}
