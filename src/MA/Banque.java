package MA;

public class Banque {

	protected Verificateur numero;
	public Verificateur getNumero() {
		return numero;
	}
	
    public static void main(String[] args) {
    	 Verificateur carte = new Visa();
    	 carte.Verificator("4978210033328381");
    	 carte = new Master();
    	 carte.Verificator("4978210033328381");
    	 carte = new American();
    	 carte.Verificator("4978210033328381");
    
    }
	

}
