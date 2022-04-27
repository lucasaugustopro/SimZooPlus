
package Comportamentos;

public class NaoVoar implements Interfaces.InterfaceDeVoar {
    //Aqui estou utilizando polimorfismo por sobrescrita
    @Override
    public void voar(){
        System.out.println("Eu não sou capaz de voar :( porém ");
    }
}
