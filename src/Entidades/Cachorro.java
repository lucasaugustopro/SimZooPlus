package Entidades;

import Comportamentos.AlimentoPedigree;
import Comportamentos.AndarQuatroPatas;
import Comportamentos.EmitirSomAuau;
import Comportamentos.NaoVoar;
import Util.DataUtility;

public class Cachorro extends Animal {
//Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void imprimir() {
        //Aqui instancio as variáveis com seus respectivos objetos
        comportamentoDeEmitirSom = new EmitirSomAuau();
        comportamentoDeAlimentar = new AlimentoPedigree();
        comportamentoDeAndar = new AndarQuatroPatas();
        comportamentoDeVoar = new NaoVoar();
        
        System.out.println("Apresentação do Cachorro: ");
        apresentacao();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeAlimentar.alimentar();
        System.out.println("Minha idade é: " + calcularIdade(DataUtility.transformarStringEmData("03/12/2016")) + " anos");
        comportamentoDeVoar.voar();
        comportamentoDeAndar.andar();
    }

}
