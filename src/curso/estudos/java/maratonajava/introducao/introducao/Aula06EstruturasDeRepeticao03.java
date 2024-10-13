package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //como parar os laços de repetição
        // Imprima os primeiros 25 numeros de um dado valor
        int valormaximo = 50;
        for (int i = 0; i < valormaximo; i++) {
           if (i > 25) {
               break;
           }
            System.out.println(i);
        }
    }
}
