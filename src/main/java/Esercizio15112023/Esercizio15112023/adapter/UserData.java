package Esercizio15112023.Esercizio15112023.adapter;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
