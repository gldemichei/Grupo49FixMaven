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

public class PersistenciaMotoristas {
    private static final String SAMPLE_CSV_FILE_PATH = System.getProperty("user.dir")+"\\resources\\motoristas.dat";

    public void carregaMotoristas()throws IOException{
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("cpf", "nome", "veiculo", "forma de pagamento"));
        ) {
            for (CSVRecord csvRecord : csvParser) {
                String cpf = csvRecord.get(0);
                String nome = csvRecord.get(1);
                String veiculo = csvRecord.get(2);
                String formaPagto = csvRecord.get(3);
                new Motorita(cpf, nome, veiculo, formaPagto);
            }
        }
    }

    public void persisteMotoristas() throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("cpf", "nome", "veiculo", "forma de pagamento"));
        ){
            for (Veiculo motorista: Motorista.motoristas){
                csvPrinter.printRecord(motorista.getCpf(), motorista.getNome(), motorista.getVeiculo(), motorista.getFormaPagto().toString());
            }
        }
        }
    }
