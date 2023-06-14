package com.fitfood.fitfood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {
    @Autowired
    private ClienteService service; 
    @GetMapping("/cliente")
    public ResponseEntity<String> cadastrar(@RequestBody ClienteDTO dto){
        String mensagem = service.cadastrar(dto);
        return ResponseEntity.ok(mensagem);  
    } 
}
