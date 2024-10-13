package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula05estruturascondicionais05 {
    public static void main(String[] args) {
        //switch
        // imprime o dia fa semana, considerando 1 como domingo
        byte dia = 5;
        // pode colocar os seguintes valores, char, int, byte, short, enum, String
        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sabado");
                break;
                //default é usado para quando não ter a opção escolhida pelo usuario
            default:
                System.out.println("Opção inválida"); // caso não tenha essa opção e ele pode ficar em qualquer lugar do codigo
        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("imválido");
        }

    }
}
