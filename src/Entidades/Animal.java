package Entidades;

import Interfaces.InterfaceDeEmitirSom;
import Interfaces.InterfaceDeAlimentar;
import Interfaces.InterfaceDeAndar;
import Interfaces.InterfaceDeVoar;
import Util.DataUtility;
import java.util.Calendar;
import java.util.Date;
import lombok.*;
//Notacao para obter os metodos gets e sets
@Getter
@Setter
public abstract class Animal {
    //Tipifico as variaveis
    private String nome;
    private String cor;
    private String descricao;
    private int identificador;
    private char sexo;
    private Calendar dataNascimento;
    private Especie especie;

    InterfaceDeEmitirSom comportamentoDeEmitirSom;
    InterfaceDeAlimentar comportamentoDeAlimentar;
    InterfaceDeAndar comportamentoDeAndar;
    InterfaceDeVoar comportamentoDeVoar;

    //Método comum a todos as entidades e que deverá ser implementado.
    public abstract void imprimir();
    /*
    Método contrutor --> public Animal()
    Aqui será determinada quais ações devem ser executadas quando for criado um objeto 
     */
    public Animal() {

        /*
        Quando for instanciado um objeto da classe Animal, imediatamente será criado um objeto 
        cuja classe é Especie de relacionamento por agregação simples.
         */
        this.especie = new Especie();

    }
    //Metodo para resumir a apresentacao comum em todas as classes
    public void apresentacao() {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Eu sou " + cor);
        System.out.println("Meu sexo é: " + sexo);
        System.out.println("Minha breve descrição: " + descricao);
        System.out.println("Meu identificador é: " + identificador);
    }
    //Metodo publico para retornar a data de nascimento
    public int calcularIdade(Date dataNascimento) {
        return DataUtility.calcularIdade(dataNascimento);

    }

}
