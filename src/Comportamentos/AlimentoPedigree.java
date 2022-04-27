package Comportamentos;

public class AlimentoPedigree implements Interfaces.InterfaceDeAlimentar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void alimentar() {
        System.out.println("Eu me alimento de ração pedigree ");
    }
    
}