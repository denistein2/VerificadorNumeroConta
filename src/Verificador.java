import java.util.Scanner;

public class Verificador{

    public static void main(String[] args) {
        System.out.println("Digite o numero da conta: ");
        Scanner scanner = new Scanner(System.in);

        try {

        String numeroConta = scanner.nextLine();
          
           verificarNumeroConta(numeroConta);
            
        System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            if(numeroConta == null || numeroConta.length() != 8) {
                throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
            }
            // TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."
        }
    }
}