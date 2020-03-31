package com.Grupo49FixMaven;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class PersistenciaVeiculos {
    private static final String SAMPLE_CSV_FILE_PATH = System.getProperty("user.dir")+"\\resources\\veiculos.dat";

    public void carregaVeiculos()throws IOException{
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("placa", "marca", "cor", "categoria"));
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1);
                String cor = csvRecord.get(2);
                String categoria = csvRecord.get(3);
                new Veiculo(placa, marca, cor, categoria);
            }
        }
    }

    public void persisteVeiculos() throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("placa", "marca", "cor", "categoria"));
        ){
            for (Veiculo veiculo: Veiculo.veiculos){
                csvPrinter.printRecord(veiculo.getPlaca(), veiculo.getMarca(), veiculo.getCor(), veiculo.getCategoria());
            }
        }
        }
        /*
        FileWriter file = new FileWriter("veiculosTO.dat");
        for (Veiculo v : Veiculo.veiculos){
            file.write(v.getPlaca()+","+v.getMarca()+","+v.getCor()+","+v.getCategoria()+"\n");
        }
        file.close();
        */
    }
