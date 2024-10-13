package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula04operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 23;
        int resultado = numero02 * numero01;
        System.out.println(resultado);
        //operadores de resto são eles %,
        int resto = 20 % 3;
        System.out.println(resto);
        //operadores lógicos sempre irão retornar um valor booleano são eles <, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        //introduçãs aos operadores lógicos, temos 3 tipos de operadores logicos são eles : && (and), || (or), ! (not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQue30 "+isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30 "+isDentroDaLeiMenorQue30);


        double contacorrente = 200;
        double contapopanca = 10000;
        float valorplaystation = 5000;

        boolean isPlaystationCincoCompravel = contacorrente > valorplaystation || contapopanca > valorplaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
        // operadores de atribuição sao eles =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus = bonus + 1000; // mais pra frente pode usar bonus += 1000 para simplificar o código
        System.out.println(bonus);
        //
        int contador = 0;
        contador += 1;
        System.out.println(contador);
        // outra forma é contador ++ , se colocar os sinais antes primeiro ele vai incrementar pra depois executar

        





    }
}
