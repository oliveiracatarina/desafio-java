package br.com.desafiojava.controller;

import br.com.desafiojava.models.Beneficiario;
import br.com.desafiojava.service.BeneficiarioService;
import br.com.desafiojava.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BeneficiarioController {

    @Autowired
    private BeneficiarioService beneficiarioService;

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping
    public Beneficiario getArquivo(
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
