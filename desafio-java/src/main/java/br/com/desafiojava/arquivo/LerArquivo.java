package br.com.desafiojava.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException; //genérico
import java.nio.file.Files;
import java.util.Scanner;

public class LerArquivo {
    public LerArquivo() throws IOException {

        File arquivo = new File("C:/workspace/desafio-java/cnab.txt");

        byte [] bytes = Files.readAllBytes(arquivo.toPath());

        String textoDoArquivo = new String(bytes, "UTF-8");
        }

        public LerArquivo mostrarLinhas(){
            String linha = "";
            String [] linhas = new String[linha.length()];

            for(int i = 0; i < linhas.length; i++){
                linhas[i] = "" + linha.charAt(i);
            }
            return null;
        }


    }

