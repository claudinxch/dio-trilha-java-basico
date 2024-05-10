import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número da conta: ");
		int numero = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Por favor, digite o número da agência: ");
		String agencia = scan.nextLine();
		
		System.out.print("Por favor, digite o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Por favor, digite o saldo: ");
		Double saldo = scan.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);

	}

}
