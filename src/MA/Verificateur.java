package MA;

public abstract class Verificateur {
	protected String num;
	public static int[] validite(String num){
		int i=0;
		int p=0;
		int s = 0;
		int[] numero = new int[num.length()]; 
		char[] ch = num.toCharArray();
		for(int j = 0; j< numero.length; j++ ){
			numero[j] = Integer.parseInt(String.valueOf(ch[j]));
		}
		for (int j = 0; j < (numero.length)/2; j++) {
			i += (2*numero[2*j])%9;
		}
		for (int j = 0; j < (numero.length-1)/2; j++) {
			
			p += numero[2*j + 1];
		}
		s = i+p+numero[numero.length-1];
		if(s%10 == 0)
		   return numero;
		System.out.println("Numero "+num+" n'est pas valide !!!");
		return null;
	}

	public abstract void Verificator(String num);
	
}
