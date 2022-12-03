package br.com.desafiojava.controller;

import br.com.desafiojava.models.Transacao;
import br.com.desafiojava.arquivo.Documentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CnabController {

    @Autowired
    private Documentacao documentacao;

    @Autowired


    @GetMapping
    public Transacao getCnab(
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
