package programaOO;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		
		Scanner input = new Scanner(System.in);
	    System.out.print("escreva se � uma moto ou um carro:");
	    String objeto = input.next();
	    if (objeto.equals("moto"))
	    	System.out.println("Quantidade de Rodas s�o:" + moto.getRodas());
	    else if (objeto.equals("carro"))
	    	System.out.println("Quantidade de Rodas s�o:" + carro.getRodas());
	    else 
	    	System.out.println("N�o se sabe quantas rodas tem esse Obejeto :( ");
	  	}
	}


