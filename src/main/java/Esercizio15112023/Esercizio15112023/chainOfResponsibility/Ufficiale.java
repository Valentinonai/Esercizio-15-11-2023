package Esercizio15112023.Esercizio15112023.chainOfResponsibility;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Ufficiale {
    private Ufficiale ufficiale;
    private int income;

    public abstract void doCheck(int income);

    public void goNext(int income){
        if(this.getUfficiale() != null) {
            this.ufficiale.doCheck(income);
        } else {
            System.out.println("Siamo arrivati alla fine della catena");
        }
    }
}
