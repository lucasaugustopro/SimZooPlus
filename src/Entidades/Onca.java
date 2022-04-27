
package Entidades;


import Comportamentos.AlimentoOnca;
import Comportamentos.AndarQuatroPatas;
import Comportamentos.EmitirSomRg;
import Comportamentos.NaoVoar;
import Util.DataUtility;

public class Onca extends Animal {
    //Aqui estou utilizando polimorfismo por sobrescrita
     @Override
     public void imprimir(){
        //Aqui instancio as variáveis com seus respectivos objetos 
        comportamentoDeEmitirSom = new EmitirSomRg();
        comportamentoDeAlimentar = new AlimentoOnca();
        comportamentoDeAndar = new AndarQuatroPatas();
        comportamentoDeVoar = new NaoVoar();
        
        System.out.println("Apresentação da Onça");
        apresentacao();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeAlimentar.alimentar();
        System.out.println("Minha idade é: " + calcularIdade(DataUtility.transformarStringEmData("01/12/2015")) + " anos");
        comportamentoDeVoar.voar();
        comportamentoDeAndar.andar();
    }
}
    

