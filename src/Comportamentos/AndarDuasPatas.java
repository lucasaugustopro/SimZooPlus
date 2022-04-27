package Comportamentos;

public class AndarDuasPatas implements Interfaces.InterfaceDeAndar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void andar() {
        System.out.println("Eu ando com duas patinhas" + "!!");
    }
    
}