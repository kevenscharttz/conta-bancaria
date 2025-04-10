import java.util.Scanner;

public class MetodosConta {

    public double receberSaldos(double saldoConta, Scanner ler) {
        System.out.println("Quanto você deseja depositar?");
        double deposito = ler.nextDouble();
        double novoSaldo = (saldoConta + deposito);
        System.out.println("Agora você tem um saldo de: R$"+novoSaldo);
        return novoSaldo;
    }

    public double transferirSaldos(double saldoConta, Scanner ler){
        System.out.println("Quanto você deseja transferir?");
        double transferencia = ler.nextDouble();
        if (transferencia < saldoConta) {
            saldoConta = saldoConta-transferencia;
            System.out.println("Transfêrencia concluida!");
        } else {
            System.out.println("Você não possui saldo suficiente :(");
        }
        return saldoConta;
    }


}
