 import java.util.Scanner;

  public class Exercicio04Solucao {
	  
	  public static void main(String[] args) {
		  
	  Scanner entrada = new Scanner(System.in);
	  
	  System.out.print("Digite um valor inteiro: ");
	  
	  if (entrada.hasNextInt() == false) {
		  
	  System.out.println("ERRO! Digite um valor inteiro!");
	  
	  } else {
	  int valor = entrada.nextInt();
	  
	  System.out.println("Você digitou o valor: " + valor);
	  
	  }
	  }
	  }