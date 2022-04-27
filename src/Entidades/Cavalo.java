package Entidades;

import Comportamentos.AlimentoCapim;
import Comportamentos.AndarQuatroPatas;
import Comportamentos.EmitirSomRelinchar;
import Comportamentos.NaoVoar;
import Util.DataUtility;

public class Cavalo extends Animal {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void imprimir() {
        //Aqui instancio as variáveis com seus respectivos objetos
        comportamentoDeEmitirSom = new EmitirSomRelinchar();
        comportamentoDeAlimentar = new AlimentoCapim();
        comportamentoDeAndar = new AndarQuatroPatas();
        comportamentoDeVoar = new NaoVoar();

        System.out.println("Apresentação do Cavalo: ");
        apresentacao();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeAlimentar.alimentar();
        System.out.println("Minha idade é: " + calcularIdade(DataUtility.transformarStringEmData("05/08/2010")) + " anos");
        comportamentoDeVoar.voar();
        comportamentoDeAndar.andar();
    }
}
