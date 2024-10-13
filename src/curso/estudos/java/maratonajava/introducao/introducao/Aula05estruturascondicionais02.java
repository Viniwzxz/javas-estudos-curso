package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula05estruturascondicionais02 {
    public static void main(String[] args) {
        //caso de haver mais de uma condição
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        if (idade < 15) {
            System.out.println("categoria infaltil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        } else {
            System.out.println("categoria adulto");
        }
        ;
    }
}
