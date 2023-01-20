package com.example.demo;

import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class HistoriqueController {

    @GetMapping("/historiques/{idhistorique}")
    public Object listeHistorique(@PathVariable String idhistorique) {
        Enchere en = new Enchere();
        Historique h = new Historique();
        try {
            en = h.getHistorique(idhistorique);
        } catch (Exception e) {
            return new Error(e);
        }
        return new Data(en);
    }
}