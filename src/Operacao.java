public class Operacao {
    private String titularConta;
    private String tipoConta;
    private double saldo;
    private double valorOperacao;
    private String tipoOperacao;

    public Operacao(String titularConta, String tipoConta, double saldo, double valorOperacao, String tipoOperacao){
        this.titularConta = titularConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.valorOperacao = saldo;
        this.tipoOperacao = tipoOperacao;

    }

    public String getTitularConta(){
        return titularConta;
    }

    public void setTitularConta(){
        this.titularConta = titularConta;
    }

    public String getTipoConta(){
        return tipoConta;
    }

    public void setTipoConta(){
        this.tipoConta = tipoConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(){
        this.saldo = saldo;
    }

    public double getValorOperacao(){
        return valorOperacao;
    }

    public void setValorOperacao(){
        this.valorOperacao = valorOperacao;
    }

    public String getTipoOperacao(){
        return tipoOperacao;
    }

    public void setTipoOperacao(){
        this.tipoOperacao = tipoOperacao;
    }

    @Override
    public String toString(){
        return "\nOperação: \n{" +
                "\n titularConta= ' " + titularConta + '\'' +
                "\n tipoConta= '" + tipoConta + '\'' +
                "\n saldo = '" + saldo + '\'' +
                "\n valorDeOperacao= '" + valorOperacao + '\'' +
                "\n tipoOperacao = '" + tipoOperacao +
                '}';
    }
}
