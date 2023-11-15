package Esercizio15112023.Esercizio15112023.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Interfaccia{
    private List<Pagina> pagine=new ArrayList<>();

    public void setPagine(Pagina p){
        pagine.add(p);
    }
    @Override
    public void print() {
        System.out.println("Stampo una sezione");
    }

    @Override
    public int calcolaPagine() {
        int tot=0;
        for(int i=0;i<pagine.size();i++){
            tot+=pagine.get(i).calcolaPagine();
        }
        return tot;
    }
}
