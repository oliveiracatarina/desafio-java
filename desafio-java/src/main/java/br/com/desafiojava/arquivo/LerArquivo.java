package br.com.desafiojava.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) throws FileNotFoundException {


        File arquivo = new File("C:/workspace/desafio-java/cnab.txt");


        Scanner scan = new Scanner(arquivo);

            while (scan.hasNextLine()) { //enquanto tiver linha, vai ler uma por uma
                System.out.println(scan.nextLine());
            }
        }
    }

