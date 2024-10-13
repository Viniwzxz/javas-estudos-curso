package curso.estudos.java.maratonajava.introducao.core.Aintroducaoclasses.Aintroducaoclasses.test;

import curso.estudos.java.maratonajava.introducao.core.Aintroducaoclasses.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Dodge Challenger";
        carro1.modelo = "HellCat";
        carro1.ano = 2019;
        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        Carro carro2 = new Carro();
        carro2.nome = "Chevette";
        carro2.modelo = "DL";
        carro2.ano = 1987;
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
