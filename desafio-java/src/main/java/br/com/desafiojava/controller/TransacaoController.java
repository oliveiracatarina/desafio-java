package br.com.desafiojava.controller;

import br.com.desafiojava.models.Arquivo;
import br.com.desafiojava.service.ArquivoService;
import br.com.desafiojava.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TransacaoController {

    @Autowired
    private ArquivoService arquivoService;

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping
    public Arquivo getArquivo(
            @RequestParam(value = "cpf") String cpf,
            @RequestParam(value = "data") String data,
            @RequestParam(value = "valor") String valor,
            @RequestParam(value = "cartao") String cartao,
            @RequestParam(value = "hora") String hora,
            @RequestParam(value = "donoLoja") String donoLoja,
            @RequestParam(value = "nomeLoja") String nomeLoja,
            @RequestParam(value = "tipoTransacao") String tipoTransacao,
            @RequestParam(value = "descricao") String descricao,
            @RequestParam(value = "natureza") String natureza,
            @RequestParam(value = "sinal") String sinal
    ){
        return null;
    }
}
