import static java.lang.System.out;

public class Contas {
    public static void main(String[] args) {
        Conta c1 = new Conta(4545, "Fábio Ferreira de Albuquerque");
        Conta c2 = new Conta(9090, "Júlio da Fonseca Cosme");
        Conta c = new Conta();
        
        Data data = new Data();
        
        //c1.setTitular("André Alves Julião");
        //c1.numeroConta = 303030;
        c1.agencia = "2190-0";
        c1.setSaldo(22000);
        c1.depositar(-80.00);
        c1.recuperarDadosParaImpressao();
       
        out.println(c1.numeroConta);
        out.println(c1.getTitular());
        
        out.println(c2.numeroConta);
        out.println(c2.getTitular());
        
        int total = Conta.getTotalDeContas();
        
        
    }
}
