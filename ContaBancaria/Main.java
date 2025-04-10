import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MetodosConta metodo = new MetodosConta();
        Scanner ler = new Scanner(System.in);

        //infos iniciais
        String nome = "Keven Willians";
        String tipoConta = "Corrente";
        double saldoConta = 2500;
        int opcao;

        System.out.printf("""
                *************************************************
                SEJA BEM VINDO SENHOR(A) %s
                
                Dados iniciais do cliente:
                
                Nome:               %s
                Tipo de conta:      %s
                Saldo inicial:      %.2f
                *************************************************
                
                %n""", nome, nome, tipoConta, saldoConta);

        System.out.println("""
                Operações
                
                1- Consultar valor
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);

        opcao = ler.nextInt();
        while (opcao != 4){
            switch (opcao) {
                case 1:
                    System.out.println("Você possui R$"+saldoConta);
                    break;
                case 2:
                    saldoConta = metodo.receberSaldos (saldoConta, ler);
                    break;
                case 3:
                    saldoConta = metodo.transferirSaldos (saldoConta, ler);
                    break;
                

                    default:
                    System.out.println("Opção invalida\n");
                    break;
            }
            System.out.println("""
                \nOperações
                
                1- Consultar valor
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
            opcao = ler.nextInt();
        }
        System.out.println("Encerrando o sistema. Obrigado!");
    }
}
