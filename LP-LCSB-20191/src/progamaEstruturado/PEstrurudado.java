package progamaEstruturado;

import java.util.Scanner;

public class PEstrurudado {

	public static void main(String[] args) {
		    
		Scanner input = new Scanner(System.in);
	    System.out.print("escreva se � uma moto ou um carro: ");
	    String objeto = input.next();
	    if (objeto.equals("moto"))
	    	System.out.println("Quantidade de Rodas s�o: 2");
	    else if (objeto.equals("carro"))
	    	System.out.println("Quantidade de Rodas s�o: 4");
	    else 
	    	System.out.println("N�o se sabe quantas rodas tem esse Obejeto :( ");
	  	}

	}


