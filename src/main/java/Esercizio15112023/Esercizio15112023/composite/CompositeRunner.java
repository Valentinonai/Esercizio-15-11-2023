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
        Sezione s1=new Sezione();
        s1.setPagine(p);
        s1.setPagine(p);
        s1.setPagine(p);
        s1.setPagine(p);
        s1.setPagine(p);
        s.setPagine(s1);

        Libro libro=new Libro(34, Arrays.asList("pippo","pluto","paperino"),Arrays.asList(s,s,s,p,p,p,p,p,p,p,p));
        System.out.println("Il numero totale delle pagine è: "+ libro.calcolaPagine());
    }
}
