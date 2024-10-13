package curso.estudos.java.maratonajava.introducao.core.Aintroducaoclasses.Aintroducaoclasses.test;

public class EstudanteTest {
    public static void main(String[] args) {
        curso.estudos.java.maratonajava.introducao.core.Aintroducaoclasses.Aintroducaoclasses.dominio.Estudante estudante = new curso.estudos.java.maratonajava.introducao.core.Aintroducaoclasses.Aintroducaoclasses.dominio.Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
