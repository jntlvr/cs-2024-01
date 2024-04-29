public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100.0);

        try {
            conta.sacar(50.0);
            System.out.println("Saque de 50.0 realizado.);

            conta.sacar(100.0);
            System.out.println("Saque de 100.0 realizado.);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}