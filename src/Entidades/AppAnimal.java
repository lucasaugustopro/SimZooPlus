package Entidades;

public class AppAnimal {

    public static void main(String[] args) {
        //Aqui instancio as variáveis com seus respectivos objetos
        Cachorro dog = new Cachorro();
        Cavalo pocoto = new Cavalo();
        PeixeTilapia nemo = new PeixeTilapia();
        Galinha claudia = new Galinha();
        Gato miau = new Gato();
        Leao simba = new Leao();
        Onca petunia = new Onca();
        //Aqui seto os parâmetros dos animais e executo a impressão na tela
        System.out.println("####################################################");
        dog.setNome("Demônio Da Tasmânia");
        dog.setCor("marrom" + "!");
        dog.setSexo('M');
        dog.setIdentificador(101);
        dog.setDescricao("O cachorro Maltes é um dos cachorros marrons mais famosos e "
                + "\n" + "mais antigo do continente europeu e foram criados tradicionalmente como cães de colo.");
        dog.imprimir();
        System.out.println("####################################################");
        System.out.println("");
        System.out.println("");
        System.out.println("####################################################");
        pocoto.setNome("Napoleão");
        pocoto.setCor("preto com listras brancas");
        pocoto.setSexo('M');
        pocoto.setIdentificador(202);
        pocoto.setDescricao("O cavalo Andaluz são descendentes do cavalo Espanhol eram "
                + "\n" + "utilizados nas cortes europeias esse cavalo e originalizado da Peninsula Ibérica,"
                + "\n" + "e esse cavalo e considerado um cavalo muito veloz de corrida. ");
        pocoto.imprimir();
        System.out.println("####################################################");
        System.out.println("");
        System.out.println("");
        System.out.println("####################################################");
        nemo.setNome("Nemo");
        nemo.setCor("Azul florescente");
        nemo.setSexo('M');
        nemo.setIdentificador(303);
        nemo.setDescricao("O Tetra-neon ou simplesmente neon pertence à família Characidae e "
                + "\n" + "é um dos tipos de peixe de aquário mais comuns. Nativo da América do Sul, onde habita o rio Amazonas.");
        nemo.imprimir();
        System.out.println("####################################################");
        System.out.println("");
        System.out.println("");
        System.out.println("####################################################");
        claudia.setNome("Claudia");
        claudia.setCor("vermelha");
        claudia.setSexo('F');
        claudia.setIdentificador(203);
        claudia.setDescricao("A Galinha ou Gallus gallus são aves domésticas pertencentes à "
                + "\n" + "Ordem Galliforme, Família Phasianidae. São animais de médio porte, variando de 400g "
                + "\n" + "a 6kg, de acordo com a raça. São de origem asiática, porém foram introduzidas em todas as partes do mundo graças à domesticação.");
        claudia.imprimir();
        System.out.println("####################################################");
        System.out.println("");
        System.out.println("");
        System.out.println("####################################################");
        miau.setNome("Tom");
        miau.setCor("azulado");
        miau.setSexo('M');
        miau.setIdentificador(207);
        miau.setDescricao("O Gato Jaguarundi ou Herpailurus yagouaroundi, mais conhecido como "
                + "\n" + "gato-mourisco é um mamífero carnívoro da família dos felídeos e um animal"
                + "\n" + "nativo da America do Norte na naruteza ele anda em pares ou sozinho.");
        miau.imprimir();
        System.out.println("####################################################");
        System.out.println("");
        System.out.println("");
        System.out.println("####################################################");
        simba.setNome("Simba");
        simba.setCor("laranja");
        simba.setSexo('M');
        simba.setIdentificador(209);
        simba.setDescricao("O leão (nome científico: Panthera leo) é uma espécie de mamífero carnívoro"
                + "\n" + "do gênero Panthera e da família Felidae. A espécie é atualmente encontrada na África"
                + "\n" + "subsaariana e na Ásia, com uma única população remanescente em perigo, no Parque Nacional da Floresta de Gir, Gujarat, Índia");
        simba.imprimir();
        System.out.println("####################################################");
        System.out.println("");
        System.out.println("");
        System.out.println("####################################################");
        petunia.setNome("Petunia");
        petunia.setCor("amarela com manchas marrons");
        petunia.setSexo('F');
        petunia.setIdentificador(289);
        petunia.setDescricao("A onça parda, também chamada de puma, possui coloração do pêlo geralmente "
                + "\n" + "marrom-amarelada como a dos veados. No lado ventral do corpo e em algumas regiões do focinho"
                + "\n" + "fica mais clara. As partes internas das pernas, peito e garganta são brancas.");
        petunia.imprimir();
        System.out.println("####################################################");

    }

}
