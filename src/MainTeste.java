import java.time.LocalDate;

import dominio.Teste;

public class MainTeste {
    public static void main(String[] args) {

        Teste teste1 = new Teste();
        teste1.setTeste(1);
        teste1.setTitulo("Teste Java");
        teste1.setDescricao("Apenas um teste ");
        teste1.setData(LocalDate.now());

        Teste teste2 = new Teste();
        teste2.setTeste(2);
        teste2.setTitulo("Teste Java 2");
        teste2.setDescricao("Apenas mais um teste 2");

        System.out.println(teste1);
        System.out.println(teste2);
    }
}
