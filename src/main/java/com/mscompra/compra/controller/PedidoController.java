package com.mscompra.compra.controller;


import com.mscompra.compra.model.Pedido;
import com.mscompra.compra.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/pedido")
@Controller
public class PedidoController {

    private final PedidoService pedidoService;
    @PostMapping
    public ResponseEntity<Pedido> salvar(@RequestBody @Valid Pedido pedido){
        return ResponseEntity.ok(pedidoService.salvar(pedido));
    }

}
