package Comportamentos;

public class VoarPlanar implements Interfaces.InterfaceDeVoar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void voar(){
        System.out.println("Eu consigo planar" + "! ");
    }
}

