package locadora.application;

import locadora.model.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Carro c1 = new Carro("Fiat","Toro","Preto","AAA-1234",100.00);
        Carro c2 = new Carro("Toyota", "Hilux", "Cinza-Chumbo","BBB-4321",150.00);
        Carro c3 = new Carro("Volkswagen","Jetta","Branco","ABC-1B34",110.00);
        Carro c4 = new Carro("Fiat","Bravo","Branco","FHK-3374",100.00);
        Carro c5 = new Carro("BMW","320i","Preto","BMW-1234",120);
        Carro c6 = new Carro("Mercedes-Benz","GLA200","Azul","EOS-1234",130.00);
        Carro c7 = new Carro("Volkswagen","UP","Prata","UPV-1234",80.00);
        Carro c8 = new Carro("Hyundai","Elantra","Preto","FIG-9876",90.00);
        Carro c9 = new Carro("Volvo","XC40","Preto","FIM-0000",140.00);
        Carro c10 = new Carro("Audi","Q3","Azul","PIB-3J70",200.00);

        List<Carro> listadecarros = new ArrayList<>();

        listadecarros.add(c1);
        listadecarros.add(c2);
        listadecarros.add(c3);
        listadecarros.add(c4);
        listadecarros.add(c5);
        listadecarros.add(c6);
        listadecarros.add(c7);
        listadecarros.add(c8);
        listadecarros.add(c9);
        listadecarros.add(c10);


        for (Carro listadecarro : listadecarros) {
            System.out.println(listadecarro);
        }

        Collections.sort(listadecarros);

        for (Carro listadecarro : listadecarros) {
            System.out.println(listadecarro);
        }

    }
}
