class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor>this.saldo) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
    }
}