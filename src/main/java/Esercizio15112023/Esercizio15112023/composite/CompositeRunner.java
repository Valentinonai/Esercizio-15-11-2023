package Esercizio15112023.Esercizio15112023.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagina p=new Pagina();

        Sezione s=new Sezione();
        s.setPagine(p);
        s.setPagine(p);
        s.setPagine(p);
        s.setPagine(p);
        s.setPagine(p);
        s.setPagine(p);

        Libro libro=new Libro(34, Arrays.asList("pippo","pluto","paperino"),Arrays.asList(s,s,s));
        System.out.println("Il numero totale delle pagine è: "+ libro.calcolaPagine());

        
    }
}
