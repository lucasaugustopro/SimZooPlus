
package Entidades;

import Comportamentos.AlimentoBife;
import Comportamentos.AndarQuatroPatas;
import Comportamentos.EmitirSomRugir;
import Comportamentos.NaoVoar;
import Util.DataUtility;


public class Leao extends Animal {
    //Aqui estou utilizando polimorfismo por sobrescrita
     @Override
     public void imprimir(){
        //Aqui instancio as variáveis com seus respectivos objetos
        comportamentoDeEmitirSom = new EmitirSomRugir();
        comportamentoDeAlimentar = new AlimentoBife();
        comportamentoDeAndar = new AndarQuatroPatas();
        comportamentoDeVoar = new NaoVoar();
        
        System.out.println("Apresentação do Leão");
        apresentacao();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeAlimentar.alimentar(); 
        System.out.println("Minha idade é: " + calcularIdade(DataUtility.transformarStringEmData("26/02/2016")) + " anos");
        comportamentoDeVoar.voar();
        comportamentoDeAndar.andar();
        
    }
}
