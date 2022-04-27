package Comportamentos;

public class AlimentoBife implements Interfaces.InterfaceDeAlimentar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void alimentar() {
        System.out.println("Eu me alimento de bife passado na manteiga de garrafa ");
    }
    
}
