package curso.estudos.java.maratonajava.introducao.core.Aintroducaoclasses.Aintroducaoclasses.test;

import curso.estudos.java.maratonajava.introducao.core.Aintroducaoclasses.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
