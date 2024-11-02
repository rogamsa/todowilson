/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sistema.demo.Controller;
import com.Sistema.demo.model.Articulo;
import com.Sistema.demo.model.Compras;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.Sistema.demo.repository.ArticuloRespository;
import com.Sistema.demo.service.CompraService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Diego
 */
@Controller
public class ReporteController {

   
    
    @Autowired
    private CompraService compraService;
    
  
    @GetMapping("/reportes")
    public String mostrarReportes(Model model) {
    List<Compras> compras = compraService.findAll(); // Obtiene todas las compras
    Map<Integer, Integer> totalPorArticulo = new HashMap<>();

    // Sumar las compras por artículo
    for (Compras compra : compras) {
        totalPorArticulo.merge(compra.getArticuloId(), compra.getCantidad(), Integer::sum);
    }

    // Variables para almacenar los totales por artículo
    int totalArticulo1 = totalPorArticulo.getOrDefault(1, 0); // Total para el artículo con ID 1
    int totalArticulo2 = totalPorArticulo.getOrDefault(2, 0); // Total para el artículo con ID 2
    int totalArticulo3 = totalPorArticulo.getOrDefault(3, 0); // Total para el artículo con ID 3

    // Agregar al modelo
    model.addAttribute("totalArticulo1", totalArticulo1);
    model.addAttribute("totalArticulo2", totalArticulo2);
    model.addAttribute("totalArticulo3", totalArticulo3);

    return "reportes"; // Devuelve la vista de reportes
    }
}