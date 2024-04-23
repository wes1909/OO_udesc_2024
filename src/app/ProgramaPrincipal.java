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

        fulano.setNome("Fulano da Silva");
        fulano.setEndereco("Rua dos Programadores, 41");
        fulano.setNascimento(LocalDate.of(1990, 10, 13));
        fulano.setSalario(new BigDecimal("2000.00"));


       /* System.out.println(fulano.nome);
        System.out.println(fulano.endereco);
        System.out.println(fulano.nascimento);
        System.out.println(fulano.salario);*/

        fulano.apresentarse();
    }

}