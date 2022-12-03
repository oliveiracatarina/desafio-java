package br.com.desafiojava.arquivo;

import br.com.desafiojava.models.TipoTransacao;
import br.com.desafiojava.models.Transacao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
    public class Documentacao {

    private final LerTexto lerTexto;

    private List<Transacao> listaTransacao;

    public Documentacao(LerTexto lerTexto) {
        this.lerTexto = lerTexto;
    }

    //caminho p/ ler texto
    public List<Transacao> tudo() {
        String path = "C:/workspace/desafio-java";
        listaTransacao = new ArrayList<>();
        final List<String> linhas = lerTexto.lerArquivo(path);

        for (String linha : linhas) {
            Transacao transacao = new Transacao();
            TipoTransacao tipoTransacao = new TipoTransacao();

            //tipo de transação
            int tipo = Integer.parseInt(linha.substring(0, 1).trim());
            tipoTransacao.setTipoTransacao(tipo);
            tipoTransacao.setNatureza(tipoTransacao.getNatureza());
            tipoTransacao.setDescricao(tipoTransacao.getDescricao());
            tipoTransacao.setSinal(tipoTransacao.getSinal());

            transacao.setTipoTransacao(tipoTransacao);

            //data formatada
            String data = linha.substring(1, 9).trim();
            LocalDate dataFormatada = LocalDate.parse((data));
            transacao.setData(dataFormatada);

            //valor /100
            double valor = Double.parseDouble(linha.substring(9,19).trim());
            transacao.setValor(valor / 100);

            //restante do documento
            transacao.setCpf(linha.substring(19,30));
            transacao.setCartao(linha.substring(30,42));
            transacao.setHora(linha.substring(42,48));
            transacao.setDonoLoja(linha.substring(48,62).trim());
            transacao.setNomeLoja(linha.substring(62,80));

            listaTransacao.add(transacao);
        }
        return listaTransacao;
    }

    //all
    public List<Transacao> procurarPorCpf (String cpf){
        List<Transacao> listaTransacaoCpf = new ArrayList<>();
        if (listaTransacao == null || listaTransacao.isEmpty()){
            tudo();
        }
        for (Transacao t : listaTransacao) {
            if (t.getCpf().equals(cpf)) listaTransacaoCpf.add(t);
        }
        return listaTransacaoCpf;

    }




    }

//    //all
//        public Transacao findAll() throws IOException {
//            String textoCnab = lerArquivo();
//            List<String> linhasCnab = quebrarLinha(textoCnab);
//            return null;
//        }
//
//        //find-by-cpf
//        public Transacao findByCpf() throws IOException {
//            String textoCnab = lerArquivo();
//            List<String> linhasCnab = quebrarLinha(textoCnab);
//            return null;
//        }
//
//        //total-amount-by-period
//        public BigDecimal totalAmoutByPeriod() throws IOException {
//            String textoCnab = lerArquivo();
//            List<String> linhasCnab = quebrarLinha(textoCnab);
//            return null;
//        }
//
//        //ler arquivo e converter byte p/ string
//        private String lerArquivo() throws IOException {
//            File arquivo = new File("C:/workspace/desafio-java/cnab.txt");
//            byte[] bytes = Files.readAllBytes(arquivo.toPath());
//            return new String(bytes, "UTF-8");
//        }
//
//        //lendo por linha
//        private List<String> quebrarLinha(String cnabText) {
//            List<String> stringSeparada = new ArrayList<String>();
//            int index = 0;
//            int qntCaracteresPorLinha = 80;
//            while (index < cnabText.length()) {
//                stringSeparada.add(cnabText.substring(index,
//                        Math.min(index+qntCaracteresPorLinha,cnabText.length())));
//                index+= qntCaracteresPorLinha;
//            }
//            return stringSeparada;
//        }
//
//    }
//
