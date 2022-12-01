package br.com.desafiojava.arquivo;


import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {

    public LerArquivo() throws IOException {

        File arquivo = new File("C:/workspace/desafio-java/cnab.txt");
        byte [] bytes = Files.readAllBytes(arquivo.toPath());
        String textoDoArquivo = new String(bytes, "UTF-8");

        List<String> stringSeparada = new ArrayList<String>();
        int index = 0;
        int qtdCaracteresPorLinha = 100;
        while (index < textoDoArquivo.length()){

            stringSeparada.add(textoDoArquivo.substring(index.Math.min(index
                    + qtdCaracteresPorLinha, textoDoArquivo.length())));
            index += qtdCaracteresPorLinha;
    }
}

}







//    FileInputStream stream = new FileInputStream("C:/workspace/desafio-java/cnab.txt");
//        InputStreamReader reader = new InputStreamReader(stream);
//
//        //br oferece metodo de leitura readLine
//        BufferedReader br = new BufferedReader(reader);
//        String linha = br.readLine();
//        while(linha != null){
//            linha = br.readLine();
//        }


//    //separando por linha
//    public LerArquivo mostrarLinhas(){
//        String linha = ""; //inicializando a variavel
//        String [] linhas = new String[linha.length()];
//        for(int i = 0; i < linhas.length; i++){
//            linhas[i] = "" + linha.charAt(i);
//        }
//        return null;
//    }


    //        Path path = Paths.get("C:/workspace/desafio-java/cnab.txt");
//
//        try {
//            String content = Files.readString(path);
//        } catch (IOException e) {
//            //escreve no console o erro
//            e.printStackTrace();
////            throw new RuntimeException(e);
//        }






