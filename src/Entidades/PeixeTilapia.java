
package Entidades;

import Comportamentos.AlimentoMinhocas;
import Comportamentos.AndarNadador;
import Comportamentos.EmitirSomSemSom;
import Comportamentos.NaoVoar;
import Util.DataUtility;

public class PeixeTilapia extends Animal {
    //Aqui estou utilizando polimorfismo por sobrescrita
     @Override
     public void imprimir(){
        //Aqui instancio as variáveis com seus respectivos objetos
        comportamentoDeEmitirSom = new EmitirSomSemSom();
        comportamentoDeAlimentar = new AlimentoMinhocas();
        comportamentoDeVoar = new NaoVoar();
        comportamentoDeAndar = new AndarNadador(); 
        
        System.out.println("Apresentação do Peixe Tilapia:");
        apresentacao();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeAlimentar.alimentar();
        System.out.println("Minha idade é: " + calcularIdade(DataUtility.transformarStringEmData("02/03/2001")) + " anos");
        comportamentoDeVoar.voar();
        comportamentoDeAndar.andar();
    }
}

