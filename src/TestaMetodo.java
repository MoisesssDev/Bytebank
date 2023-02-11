public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaMoises = new Conta();
        contaMoises.saldo = 100; // saldo R$ 100

        contaMoises.deposita(50); // novo saldo R$ 150


        Conta contaPaulo = new Conta();
        contaPaulo.saldo = 200; // saldo R$ 200


        contaPaulo.deposita(20); //novo Saldo de Paulo R$ 220

        contaPaulo.sacar(220);

    }
}
