package br.com.desafiojava.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class LerArquivo {
    public LerArquivo() throws IOException {

      //  public static void main(String[] args) throws FileNotFoundException {

        File arquivo = new File("C:/workspace/desafio-java/cnab.txt");

        byte [] bytes = Files.readAllBytes(arquivo.toPath());

        String textoDoArquivo = new String(bytes, "UTF-8");

        }


    }

