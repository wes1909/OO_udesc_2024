package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {
    //Método toString() //////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nascimento=" + nascimento +
                ", salario=" + salario +
                '}';

        //  System.out.println(pessoa);

    }
//Váriaveis////////////////////////////////////////////////////////////////////
    private String nome;
    private String endereco;
    private LocalDate nascimento;
    private BigDecimal salario;
    //Construtores///////////////////////////////////////////////////////////////
    public Pessoa() { }
    public Pessoa(String nome,String endereco,LocalDate nascimento,BigDecimal salario) {

        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.salario = salario;

/* Para passar os atributos direto no objeto
        Pessoa fulano = new Pessoa("Fulano da Silva","Rua dos Programadores, 41",
                LocalDate.of(1990, 10, 13),new BigDecimal("2000.00"));*/
    }

    //Getters & Setters/////////////////////////////////////////////////////////////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    /* Pessoa p = new Pessoa();
        p.setNome("Zé da Silva");
        System.out.printf("Pessoa: "+p.getNome());*/

 //Método/////////////////////////////////////////////////////////////////
    public void apresentarse() {

        System.out.println("Nome......: " + this.nome);
        System.out.println("Endereço......: " + this.endereco);
        System.out.println("Nascimento......: " + this.nascimento);
        System.out.println("Salário......: " + this.salario);

        // Para imprimir os atributos do obejeto usando o método
    }

}
