/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sistema.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Diego
 */

@Controller
public class ArticuloController {

    @GetMapping("/")
    public String mostrarArticulos() {
        return "index"; // Asegúrate de que index.html esté en el directorio correcto
    }
}