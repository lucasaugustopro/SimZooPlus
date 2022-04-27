package Comportamentos;

public class AndarQuatroPatas implements Interfaces.InterfaceDeAndar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void andar() {
        System.out.println("Eu ando com quatro patinhas" + "!!");
    }
    
}