package Comportamentos;

public class AlimentoMilho implements Interfaces.InterfaceDeAlimentar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void alimentar() {
        System.out.println("Eu me alimento de milho");
    }
    
}

