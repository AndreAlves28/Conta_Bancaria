import static java.lang.System.out;

    class Conta {
    private String titular;
    String agencia;
    Data dataAbertura;
    int numeroConta;
    private double saldo;
    private static int totalDeContas;
    
    Conta(String titular) {
        this.titular = titular;
    }
    
    Conta(int numeroConta, String titular) {
        this(titular);
        this.numeroConta = numeroConta; 
    }
    
    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            out.println("Saque realizado com sucesso!");
        } else {
            out.println("Valor para saque insuficiente");
        }
    }
    
    void depositar(double valor) {
        if(valor > 0) {
        this.saldo = this.saldo + valor;
        } else {
            out.println("Saldo de desposito negativo.");
        }
    }
    
    double calcularRendimento() {
        return this.saldo *= 0.1; 
    }
    
    void recuperarDadosParaImpressao() {
        out.println("Titular: " + this.titular);
        out.println("Número da conta: " + this.numeroConta);
        out.println("Número da agência: " + this.agencia);
        out.println("Saldo em conta: " + this.saldo);
     
        
    }
    
}
 