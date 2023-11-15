package Esercizio15112023.Esercizio15112023.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Libro implements Interfaccia{
    private double price;
    private List<String> autori;
    private  List<Sezione> child;

    public void print(){
        System.out.println("Stampo il libro");
    }



    public void setChild(Sezione i){
        child.add(i);
    }
    @Override
    public int calcolaPagine() {
        int tot=0;
        for(int i=0;i<child.size();i++)
        {
            tot+=child.get(i).calcolaPagine();
        }
        return tot;
    }
}
