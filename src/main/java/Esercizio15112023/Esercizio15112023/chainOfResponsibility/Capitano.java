package Esercizio15112023.Esercizio15112023.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Capitano extends Ufficiale {
    private int income=1000;



    @Override
    public void doCheck(int income) {
        if(this.getIncome()>=income){
            System.out.println("L'ufficiale con income>= "+ income+" è Capitano");
        }
            this.goNext(income);

    }
}
