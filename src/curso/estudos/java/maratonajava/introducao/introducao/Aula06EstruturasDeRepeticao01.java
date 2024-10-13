package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count = count + 1;
            //ou para simplificar pode usar System.out.println(++count);
        }
        // do while, vai executar pelo menos uma vez independete ser for falso ou verdadeiro
        do {
            System.out.println("Dentro do while");
        }    while (count < 10);
        // for trabalha com indices, mais utilizado pra contagens
        for (int i=0; i<10; i++){
            System.out.println("for " + i);

        }

    }
}
