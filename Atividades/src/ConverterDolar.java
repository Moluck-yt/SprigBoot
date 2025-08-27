public class ConverterDolar implements ConversaoFinanceira{
    private double valorEmDolar;
    private double valorEmReais;
    private double taxaDeCambio;

    public double getValorEmReais() {
        return valorEmReais;
    }

    public void setValorEmReais(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    public double getTaxaDeCambio() {
        return taxaDeCambio;
    }

    public void setTaxaDeCambio(double taxaDeCambio) {
        this.taxaDeCambio = taxaDeCambio;
    }

    public static void main(String[] args) {
        ConverterDolar converter = new ConverterDolar();
        converter.setValorEmDolar(10.0);
        converter.setTaxaDeCambio(5.30);
        System.out.println("Valor dolar: " + converter.converterDolarParaReal());
    }

    @Override
    public double converterDolarParaReal() {
       return valorEmReais = valorEmDolar * taxaDeCambio;
    }
}

