package br.com.desafiojava.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerTexto {

    public List<String> lerArquivo(String path) {
        List<String> linhas = new ArrayList<>();
        File arquivoBase = new File(path);

        try{
            Scanner leituraBase = new Scanner(arquivoBase);
            while (leituraBase.hasNextLine()){
                String linha = leituraBase.nextLine();
                linhas.add(linha);
            }
            leituraBase.close();
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        return linhas;
    }

}
