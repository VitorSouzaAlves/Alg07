import java.util.Scanner;

public static Scanner scanner = new Scanner(System.in);
public static void main() {
    byte escolha;

    do {
        System.out.print("""
                Digite o número indicado para realizar uma das opções a seguir:
                
                1 - Verificar valores da taboada de um número até 10
                2 - Chute de número até a igualdade
                3 - Simulador caixa eletrônico
                4 - Cálculo de exponencial
                5 - Verificação de fatorial
                0 - Sair
                """);
        System.out.print("\nDigite a opção: ");
        escolha = scanner.nextByte();

        switch (escolha){
            case 0:
                System.out.println("Saindo...");
                break;
            case 1:
                verificarTaboada();
                break;
            default:
                System.out.println("Opção inválida\n");
        }
    }while (escolha != 0);
}

private static void verificarTaboada (){
    int n1, i, resultado;

    System.out.print("\nDigite o número que deseja ver a taboada: ");
    n1 = scanner.nextInt();

    for (i = 1; i <= 10; i++){
        resultado = n1 * i;
        System.out.println("Multiplicado por " + i + ": " + resultado);
    }
    System.out.println();
}

private static void chuteAteIgualdade(){

}