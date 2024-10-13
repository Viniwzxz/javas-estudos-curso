package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte , short , int , long , float e double valor = 0
        // char , '/u0000' ' ' = espaço em branco
        //boolean = falso
        // String = null
        String [] nomes = new String[3];
        nomes [0] = "Naruto";
        nomes [1] = "Killua";
        nomes [2] = "Saitama";
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
