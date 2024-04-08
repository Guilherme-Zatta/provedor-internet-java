import java.util.Scanner;

public class Correcao {
    public static void main(String[] args) throws Exception {
        String provedor = "CineMax";
        System.out.printf("Olá, bem-vindo a central de atendimento %s", provedor);
        String atendente = "Mary Jane";
        System.out.printf("Meu nome é %s, sou seu assistente virtual", atendente);

        System.out.println("Durante o atendimento siga minhas instruções");

        System.out.println("Primeiramente informe seu nome");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();

        System.out.printf("Obrigado s%, como posso lhe ajudar?", nome);
 
        String resposta = scanner.next();


        }
    }