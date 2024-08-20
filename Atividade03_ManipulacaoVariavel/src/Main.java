public class Main {
    public static void main(String[] args) {
        String produto = "Omo";
        double preco = 25.00;
        int quantidade = 300;
        double imposto = 0.13;
        double lucro = 0.25;

        double valorSemImposto = preco * quantidade;
        double valorImposto = valorSemImposto * imposto;
        double valorComImposto = valorSemImposto + valorImposto;
        double valorLucro = valorComImposto * (1 + lucro);

        System.out.println(produto);
        System.out.println(preco);
        System.out.println(quantidade);
        System.out.println(imposto);
        System.out.println(lucro);
        System.out.println(valorSemImposto);
        System.out.println(valorImposto);
        System.out.println(valorComImposto);
        System.out.println(valorLucro);
    }
}