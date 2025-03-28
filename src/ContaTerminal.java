import java.util.Scanner;  // Importa a classe Scanner para leitura de dados

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria o objeto scanner para ler entradas

        // Declaração das variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicita e armazena as informações fornecidas pelo usuário
        System.out.println("Por favor, digite o número da sua Conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();  // Limpa a quebra de linha pendente

        System.out.println("Por favor, digite o nome da sua Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo: ");
        saldo = scanner.nextDouble();

        // Exibe a mensagem formatada com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar a sua conta em nosso banco, "
                + "a sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo "
                + saldo + " já está disponível para o saque.");

        scanner.close();  // Fecha o scanner após o uso
    }
}
