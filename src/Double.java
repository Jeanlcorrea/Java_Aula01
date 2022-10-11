import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		// Programa para calcular o dobro de um número
		
		
		// Vamos ativar a entrada do sistema
		Scanner entrada = new Scanner(System.in);
		
		// Vamos pedir para o usuário digitar um valor
		// ATALHO SystemOut => syso ctrl + espaço
		
		System.out.println("Digite um número: ");
		
		// Vamos criar uma variável para guardar o valor
		
		int valor = entrada.nextInt();
		
		// Vamos mostrar o dobro desse número
		
		System.out.println("O dobro é:" + 2*valor);
		
		entrada.close();

	}

}
