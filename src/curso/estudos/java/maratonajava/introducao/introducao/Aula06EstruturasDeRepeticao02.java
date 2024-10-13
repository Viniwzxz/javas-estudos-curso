package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares até 1000000
        int pares = 0;
        for (pares = 0; pares <1000000; pares++) {
            if(pares % 2 ==0){
                System.out.println(pares);
            }

        }

    }
}
