package Comportamentos;

public class AndarNadador implements Interfaces.InterfaceDeAndar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void andar() {
        System.out.println("Eu ando de maneiras nadadoras" + "!!");
    }
    
}