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

public class PersistenciaPassageiro {
    private static final String SAMPLE_CSV_FILE_PATH = System.getProperty("user.dir")+"\\resources\\passageiros.dat";

    public void carregaPassageiro()throws IOException{
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader("cpf", "nome", "n de cartao", "forma de pagamento"));
        ) {
            for (CSVRecord csvRecord : csvParser) {
                String cpf = csvRecord.get(0);
                String nome = csvRecord.get(1);
                String nCartao = csvRecord.get(2);
                String formaPagto = csvRecord.get(3);
                new Passageiro(cpf, nome, nCartao, formaPagto);
            }
        }
    }

    public void persistePassageiro() throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("cpf", "nome", "n de cartao", "forma de pagamento"));
        ){
            for (Veiculo passageiro: Passageiro.passageiros){
                csvPrinter.printRecord(passageiro.getCpf(), passageiro.getNome(), passageiro.getnCartao(), passageiro.getFormaPagto().toString());
            }
        }
        }
    }
