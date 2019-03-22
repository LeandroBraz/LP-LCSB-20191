package progamaEstruturado;

import java.util.Scanner;

public class PEstrurudado {

	public static void main(String[] args) {
		    
		Scanner input = new Scanner(System.in);
	    System.out.print("escreva se é uma moto ou um carro: ");
	    String objeto = input.next();
	    if (objeto.equals("moto"))
	    	System.out.println("Quantidade de Rodas são: 2");
	    else if (objeto.equals("carro"))
	    	System.out.println("Quantidade de Rodas são: 4");
	    else 
	    	System.out.println("Não se sabe quantas rodas tem esse Obejeto :( ");
	  	}

	}


