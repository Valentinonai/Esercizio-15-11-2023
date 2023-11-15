package Esercizio15112023.Esercizio15112023.adapter;

import java.time.LocalDate;

public class Adapter implements DataSource{
    private Info info;
    public Adapter(Info info){
        this.info=info;
    }
    @Override
    public String getNomeCompleto() {

        return info.getNome()+" "+info
                .getCognome();
    }

    @Override
    public int getEta() {
        LocalDate now=LocalDate.now();
        int ynow=now.getYear();
        int ybirth=info.getDataDiNascita().getYear();
        return ynow-ybirth;
    }
}
