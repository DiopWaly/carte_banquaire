package MA;

public class Master extends Verificateur {

	@Override
	public void Verificator(String num) {
		// TODO Auto-generated method stub
		if(super.validite(num) != null && num.length() == 16){
			int[] numcarte = super.validite(num);
			if(numcarte[0] == 5 && (numcarte[1] >= 1 && numcarte[1] <= 5 ))
				System.out.println(" "+num+" : MasterCard");
		}
		
	}



}
