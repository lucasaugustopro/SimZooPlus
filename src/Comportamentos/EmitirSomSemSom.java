package Comportamentos;

public class EmitirSomSemSom implements Interfaces.InterfaceDeEmitirSom {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void emitirSom(){
        System.out.println("Sem ... Som...");
    }
}
