package Comportamentos;


public class EmitirSomRelinchar implements Interfaces.InterfaceDeEmitirSom {
        //Aqui estou utilizando polimorfismo por sobrescrita
        @Override
        public void emitirSom() {
            System.out.println("O meu som é: " + " Relinchar");
        }
    
   
    
}
