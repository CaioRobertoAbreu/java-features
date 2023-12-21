package br.com.caio.javafeatures.switchcase;

import java.util.Locale;

public class SwitchCase {

    public static void main(String[] args) {

        var name = "Flora".toLowerCase(Locale.ROOT);
        switch (name){
            case "caio" -> System.out.println("Engenheiro de Software");
            case "eriberto" -> System.out.println("Confeiteiro");
            case "flora" -> System.out.println("Empresária");
            case "paulo" -> System.out.println("Gerente de Comex");
            default -> System.out.println("Não encontrado");
        }
    }
}
