package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valortotal = 100000;
        for (int parcela = (int) valortotal; parcela >= 1 ; parcela--) {
            double valorparcela = valortotal / parcela;
            if (valorparcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorparcela);

            }
    }
}
