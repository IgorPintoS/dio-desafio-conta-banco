import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        int numeroDaConta;
        String numeroDaAgencia;
        String digitoDaAgencia;
        String nomeDoCliente;
        String sobrenomeDoCliente;
        double saldoDaConta = 500;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        numeroDaConta = scanner.nextInt();
        if(numeroDaConta > 999){
            System.out.println("Erro, numero de conta inválido.");
        }
        System.out.println("Digite o numero da Agência (sem o dígito): ");
        numeroDaAgencia = scanner.next();

        System.out.println("Digite o dígito verificador: ");
        digitoDaAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeDoCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenomeDoCliente = scanner.next();

        System.out.println("Olá " + nomeDoCliente.concat(" " + sobrenomeDoCliente) +
                " obrigado por criar uma conta em nosso banco, " +
                "sua agência é: " + numeroDaAgencia.concat("-"+digitoDaAgencia) + ", sua conta é: " + numeroDaConta +
                " seu saldo atual é: " + saldoDaConta + " e já está disponível para saque.");
    }
}
