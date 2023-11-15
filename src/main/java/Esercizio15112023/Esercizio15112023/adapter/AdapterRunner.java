package Esercizio15112023.Esercizio15112023.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info=new Info("pippo","rossi",LocalDate.of(1998,5,5));
        UserData userData=new UserData();

        Adapter adapter=new Adapter(info);

        userData.getData(adapter);
        System.out.println("UserdData nome completo = "+userData.getNomeCompleto());
        System.out.println("UserData eta = "+ userData.getEta());
    }
}
