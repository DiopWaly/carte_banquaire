package MA;

public class Visa extends Verificateur {

	@Override
	public void Verificator(String num) {
		// TODO Auto-generated method stub
		if(super.validite(num) != null && num.length() == 16){
			int[] numcarte = super.validite(num);
			if(numcarte[0] == 4)
				System.out.println(" "+num+" : Visa carte ");
		}
	}	
}
