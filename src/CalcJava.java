import java.util.Scanner;

public class CalcJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero...");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo numero...");
        int segundoNumero = sc.nextInt();

        System.out.println("""
                Agora escolha a operacao que deseja realizar:
                1 - adicao
                2 - subtracao
                3 - multiplicacao
                4 - divisao
                """);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:

        }


        sc.close();
    }

    public static int adicionar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }

}

