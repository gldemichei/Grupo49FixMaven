package com.Grupo49FixMaven;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        new Veiculo("IMHAHSHHSJHSJHA", "Gol", "vermelha", "LUXO");
        PersistenciaVeiculos pv = new PersistenciaVeiculos();
        pv.carregaVeiculos();
        pv.persisteVeiculos();
        PersistenciaPassageiros pp = new PersistenciaPassageiros();
        pp.carregaPassageiros();
        pp.persisteMotoristas();
        PersistenciaMotoristas pm = new PersistenciaMotoristas();
        pm.carregaMotoristas();
        pm.persisteMotorista();
        System.out.println("Pull Request - Lucca");
    }
}
