package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula05estruturascondicionais03 {
    public static void main(String[] args) {
        // condição doar se salario for > 5 mil operador ternario
        double salario = 6000;
        String mensagemDoar = "eu vou doar 500 reais";
        String mensagemNaoDoar = "Ainda não tenho o dinheiro total";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);


    }
}
