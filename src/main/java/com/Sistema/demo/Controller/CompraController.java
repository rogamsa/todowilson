/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sistema.demo.Controller;

import com.Sistema.demo.model.Compras;
import com.Sistema.demo.service.CompraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Diego
 */

@Controller
public class CompraController {

    private final CompraService compraService;
    
    
    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }
    
    
    @RequestMapping(value="/registrar_compra",method=RequestMethod.POST)
public String registrar_compra(@RequestParam("articuloId") int articuloId, 
                            @RequestParam("cantidad") int cantidad,
                            Model model) {
    
        Compras nuevaCompra = new Compras();
        nuevaCompra.setArticuloId(articuloId);
        nuevaCompra.setCantidad(cantidad);
        nuevaCompra.setFechaCompra(new java.sql.Timestamp(System.currentTimeMillis()));
        
        compraService.Guardar(nuevaCompra);
        
        model.addAttribute("compras",nuevaCompra);
        return "index";     
}
    

}