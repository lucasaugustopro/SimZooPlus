
package Comportamentos;

public class EmitirSomAuau implements Interfaces.InterfaceDeEmitirSom {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void emitirSom() {
        System.out.println("Au, au, au - latido envolvente");
    }
    
}
