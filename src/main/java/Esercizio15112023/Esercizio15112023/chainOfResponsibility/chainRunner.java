package Esercizio15112023.Esercizio15112023.chainOfResponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class chainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Capitano capitano=new Capitano();
        Maggiore maggiore=new Maggiore();
        Tenente tenente=new Tenente();
        Colonnello colonnello=new Colonnello();
        Generale generale=new Generale();
        capitano.setUfficiale(maggiore);
        maggiore.setUfficiale(tenente);
        tenente.setUfficiale(colonnello);
        colonnello.setUfficiale(generale);

        capitano.doCheck(2300);
    }
}
