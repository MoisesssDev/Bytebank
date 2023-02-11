public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;


    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado, seu novo saldo"
                + " é de: " + this.saldo);
    }

    public boolean sacar(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso, no valor de "
                    + valor + ".  Seu novo saldo é de: " + this.saldo);
            return true;
        } else {
            System.out.println("Voce nao possui Saldo para saque, seu"
                    + " saldo é de: " + this.saldo);

            return false;
        }

    }
}
