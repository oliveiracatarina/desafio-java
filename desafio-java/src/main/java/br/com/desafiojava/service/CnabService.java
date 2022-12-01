package br.com.desafiojava.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


@Service
    public class CnabService {
        public void findAll() throws IOException {
            String textoCnab = lerArquivo();
            List<String> linhasCnab = quebrarLinha(textoCnab);

        }

        public void findByCpf() throws IOException {
            String textoCnab = lerArquivo();
            List<String> linhasCnab = quebrarLinha(textoCnab);
        }

        public BigDecimal totalAmoutByPeriod() throws IOException {
            String textoCnab = lerArquivo();
            List<String> linhasCnab = quebrarLinha(textoCnab);
            return null;
        }

        private String lerArquivo() throws IOException {
            File arquivo = new File("C:/workspace/desafio-java/cnab.txt");
            byte[] bytes = Files.readAllBytes(arquivo.toPath());
            return new String(bytes, "UTF-8");
        }

        private List<String> quebrarLinha(String cnabText) {
            List<String> stringSeparada = new ArrayList<String>();
            int index = 0;
            int qntCaracteresPorLinha = 80;
            while (index < cnabText.length()) {
                stringSeparada.add(cnabText.substring(index,
                        Math.min(index+qntCaracteresPorLinha,cnabText.length())));
                index+= qntCaracteresPorLinha;
            }
            return stringSeparada;
        }

    }

