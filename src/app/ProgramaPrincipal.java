package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal {
    @Override
    public String toString() {
        return "ProgramaPrincipal{}";
    }

    public static void main(String[] args) {

        Pessoa fulano = new Pessoa();

        fulano.nome = "Fulano da Silva";
        fulano.endereco = "Rua dos Programadores, 41";
        fulano.nascimento = LocalDate.of(1990, 10, 13);
        fulano.salario = new BigDecimal("2000.00");


       /* System.out.println(fulano.nome);
        System.out.println(fulano.endereco);
        System.out.println(fulano.nascimento);
        System.out.println(fulano.salario);*/

        fulano.apresentarse();
    }

}