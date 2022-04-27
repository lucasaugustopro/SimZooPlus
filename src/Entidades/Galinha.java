
package Entidades;


import Comportamentos.AlimentoMilho;
import Comportamentos.AndarDuasPatas;
import Comportamentos.EmitirSomCocorico;
import Comportamentos.VoarPlanar;
import Util.DataUtility;


public class Galinha extends Animal {
    //Aqui estou utilizando polimorfismo por sobrescrita
     @Override
     public void imprimir(){
        //Aqui instancio as variáveis com seus respectivos objetos   
        comportamentoDeEmitirSom = new EmitirSomCocorico();
        comportamentoDeAlimentar = new AlimentoMilho();
        comportamentoDeAndar = new AndarDuasPatas();
        comportamentoDeVoar = new VoarPlanar();
        
        System.out.println("Apresentação da Galinha");
        apresentacao();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeAlimentar.alimentar(); 
        System.out.println("Minha idade é: " + calcularIdade(DataUtility.transformarStringEmData("28/10/2020")) + " anos");
        comportamentoDeVoar.voar();
        comportamentoDeAndar.andar();
        
    }
}
    

