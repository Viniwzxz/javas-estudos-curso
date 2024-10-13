package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula05estruturascondicionais04 {
    public static void main(String[] args) {
        // && I, todas as condições tem que ser verdadeiro
        /* V && V = V
        V && F = F
        F && V = F
        F && F = F
         */
        // || OU, sera falsa se somento tudo for falso, o rsto sera verdadeiro
        /* V || V = V
        V || F = V
        F || V = V
        F || F = F
         */
        // exercicio
        // Dado um determinado salario, qual valor anual eu vou ter que pagar de taxa
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.56 / 100;
        double valorImposto;
        if (salarioAnual <= 34713){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
