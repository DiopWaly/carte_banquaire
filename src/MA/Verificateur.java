package MA;

public abstract class Verificateur {
	protected String num;
	public static int[] validite(String num){
		int i=0;
		int s = 0;
		int[] numero = new int[num.length()]; 
		char[] ch = num.toCharArray();
		for(int j = 0; j< numero.length; j++ ){
			numero[j] = Integer.parseInt(String.valueOf(ch[j]));
			System.out.print("["+numero[j]+"]");
		}
		for (int j = 0; j < (numero.length); j++) {
			if(j%2 != 0)
			   s += numero[j];
			else{
				 i = 2*numero[j];
				 if(2*numero[j]>9){
					 s += (i/10)+(i%10);
			     }
				 else
					 s += 2*numero[j];
			}		
		}
		if(s%10 == 0){
			System.out.println("Carte valide ");
		   return numero;
		}
		  System.out.println("Numero "+num+" n'est pas valide !!!");
		return null;
	}

	public abstract void Verificator(String num);
	public static void main(String[] args) {
		System.out.println(validite("5326351191771263"));
		System.out.println(validite("4978210033328381"));
		
	}
	
}
