import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner ct = new Scanner(System.in);
		long aux = 10, mes;
		String texto1 = "En cuantos meses se va a realizar el pago? ";
		
		mes = pedriNum(ct, texto1);
		
		for(int i = 1; i<(mes+1); ++i) {
			
			if(i == 1)
				System.out.println("");
			else
			aux = aux * 2;
			
			
			
			System.out.println("El mes " + i + " pagara: " + aux);
		}
		

	}
	
	
	static long pedriNum(Scanner ct, String texto) {
		
		long respuesta = 0;
		
		System.out.println(texto);
		respuesta=ct.nextInt();
		return respuesta;
	}
	

}
