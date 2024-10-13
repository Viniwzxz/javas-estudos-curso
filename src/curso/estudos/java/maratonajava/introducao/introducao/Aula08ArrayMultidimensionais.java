package curso.estudos.java.maratonajava.introducao.introducao;

public class Aula08ArrayMultidimensionais {
    public static void main(String[] args) {
        // são arrays dentro de arrays
        //ex um representa meses outro representa dias
        int[][] dia = new int[3][3];
        dia[0][0] = 31;
        dia[0][1] = 28;
        dia[0][2] = 31;
        dia[1][0] = 30;
        dia[1][1] = 31;
        for (int i = 0; i < dia.length; i++) {
            for (int j = 0; j < dia[0].length; j++) {
                System.out.println(dia[i][j]);
            }
        }
        int[][] dias = new int[12][30];
        for(int[] arrBase: dias){
            for (int num: arrBase)
                System.out.println(num);
        }




    }
}
