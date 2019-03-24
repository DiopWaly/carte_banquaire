package MA;

public class American extends Verificateur {

	@Override
	public void Verificator(String num) {
		// TODO Auto-generated method stub
		if(super.validite(num) != null && num.length() == 16){
			int[] numcarte = super.validite(num);
			if(numcarte[0] == 3 && (numcarte[1] >= 4 && numcarte[1] <= 7 ))
				System.out.println(" "+num+" : American Express");
		}
		
	}

}
