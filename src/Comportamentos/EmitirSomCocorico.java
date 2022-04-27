package Comportamentos;

public class EmitirSomCocorico implements Interfaces.InterfaceDeEmitirSom {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void emitirSom() {
        System.out.println("O meu som é: " + "CÔCÔRICÓÓÓÓÓÓÓÓ!!!!");
    }
    
}
