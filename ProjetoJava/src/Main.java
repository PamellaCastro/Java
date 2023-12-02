// Criando Classes.
public class Main {
    public static void main(String[] args) throws Exception {

//      Declarando um objeto do tipo Celular = Instanciando um objeto.
        Celular smartphone = new Celular();
        smartphone.nome = "Iphone 12";
        smartphone.tamanhoTela = 6.1f;
        smartphone.espacoAramazenamento = 256;
        smartphone.sistemaOperacional = "iOS";

        Celular smartphone2 = new Celular();
        smartphone2.nome = "Galaxy Note 12 Ultra";
        smartphone2.tamanhoTela = 6.9f;
        smartphone2.espacoAramazenamento = 256;
        smartphone2.sistemaOperacional = "Android";

        Celular smartphone3 = new Celular();
        smartphone3.nome = "Galaxy Note 20 ultra";
        smartphone3.tamanhoTela = 6.9f;
        smartphone3.espacoAramazenamento = 256;
        smartphone3.sistemaOperacional = "Android";

        Celular smartphone4 = new Celular();
        smartphone4.nome = "Xiaomi Mi 11 Pro";
        smartphone4.tamanhoTela = 6.81f;
        smartphone4.espacoAramazenamento = 128;
        smartphone4.sistemaOperacional = "Android";



        System.out.println("SmartPhone " + smartphone.nome +" com tela de "
                + smartphone.tamanhoTela + ", armazenamento de "
                + smartphone.espacoAramazenamento + " e SO de "
                + smartphone.sistemaOperacional);

        System.out.println("SmartPhone " + smartphone2.nome +" com tela de "
                + smartphone2.tamanhoTela + ", armazenamento de "
                + smartphone2.espacoAramazenamento + " e SO de "
                + smartphone2.sistemaOperacional);

        System.out.println("SmartPhone " + smartphone3.nome +" com tela de "
                + smartphone3.tamanhoTela + ", armazenamento de "
                + smartphone3.espacoAramazenamento + " e SO de "
                + smartphone3.sistemaOperacional);

        System.out.println("SmartPhone " + smartphone4.nome +" com tela de "
                + smartphone4.tamanhoTela + ", armazenamento de "
                + smartphone4.espacoAramazenamento + " e SO de "
                + smartphone4.sistemaOperacional);

    }
}