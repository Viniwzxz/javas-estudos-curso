package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado valor de um carro, descubra quantas vezes ele pode ser parcelado
        // Condição é que valor da parcela valor deve ser >= 1000
        double valortotal = 100000;
        for (int parcela = 0; parcela <= valortotal; parcela++) {
            double valorparcela = valortotal / parcela;
            if (valorparcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorparcela);
        }
    }
}
