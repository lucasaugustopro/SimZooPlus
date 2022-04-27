
package Comportamentos;

public class EmitirSomRugir implements Interfaces.InterfaceDeEmitirSom {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void emitirSom(){
        System.out.println("Grrrraaahhwwwwlllllllllll - rugido trevoso");
    }
}
