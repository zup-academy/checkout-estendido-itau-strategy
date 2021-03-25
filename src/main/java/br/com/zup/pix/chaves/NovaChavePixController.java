package br.com.zup.pix.chaves;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/pix")
public class NovaChavePixController {

    @PostMapping
    public ResponseEntity<?> registra(@RequestBody @Valid NovaChavePixRequest novaChave) {

        System.out.println(novaChave);

        // salvar o dado com o repository

        return null;
    }
}
