package app;

//import Pessoa;
import domain.Pessoa; /*Diferença de import e extends: importar es hacer uso de una clase existente,
extender es crear una nueva clase con atributos y métodos adicionales*/


public class TestaPacote  {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();


        p.setNome("Zé da Silva");


        System.out.printf("Pessoa: "+p.getNome());

    }
}
