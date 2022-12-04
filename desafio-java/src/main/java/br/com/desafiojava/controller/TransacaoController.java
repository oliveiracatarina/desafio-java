package br.com.desafiojava.controller;

import br.com.desafiojava.arquivo.Documentacao;
import br.com.desafiojava.arquivo.LerTexto;
import br.com.desafiojava.models.Transacao;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class TransacaoController {

    private final Documentacao documentacao = new Documentacao(new LerTexto());

    @GetMapping //saber se está retornando
    public String teste(){
        return "Ok";
    }

    @GetMapping (value = "/all")
    public ResponseEntity<List<Transacao>> todos() {
        List<Transacao> listaTransacao = documentacao.tudo();
        return ResponseEntity.ok(listaTransacao);
    }

    @GetMapping (value = "/total-amout-by-period")
    public ResponseEntity<Double> totalPorPeriodo (
            @RequestParam("inicio")
            @DateTimeFormat(pattern = "yyyy-MM-dd")    //pattern -> padronizar
            LocalDate inicio,
            @RequestParam ("fim")
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fim) {
        Double periodo = documentacao.entreDuasDatas(inicio, fim);
        return ResponseEntity.ok(periodo);
    }






}
