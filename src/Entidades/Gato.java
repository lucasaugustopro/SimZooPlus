package Entidades;

import Comportamentos.AlimentoPedigree;
import Comportamentos.AndarQuatroPatas;
import Comportamentos.EmitirSomMiau;
import Comportamentos.NaoVoar;
import Util.DataUtility;

public class Gato extends Animal {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void imprimir() {
        //Aqui instancio as variáveis com seus respectivos objetos
        comportamentoDeEmitirSom = new EmitirSomMiau();
        comportamentoDeAlimentar = new AlimentoPedigree();
        comportamentoDeAndar = new AndarQuatroPatas();
        comportamentoDeVoar = new NaoVoar();
        
        System.out.println("Apresentação do Gato");
        apresentacao();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeAlimentar.alimentar();
        System.out.println("Minha idade é: " + calcularIdade(DataUtility.transformarStringEmData("26/02/1998")) + " anos");
        comportamentoDeVoar.voar();
        comportamentoDeAndar.andar();
    }
}
