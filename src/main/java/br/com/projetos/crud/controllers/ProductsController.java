package br.com.projetos.crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping ("/product")
public class ProductsController {

    @GetMapping
    public ResponseEntity getAllProducts(){

        return ResponseEntity.ok("Tudo Ok, primeiro GET (:");
    }

}
