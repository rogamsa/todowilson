/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sistema.demo.service;

import com.Sistema.demo.model.Articulo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego
 */

@Service
public class ArticuloService {

    @Autowired
    
    // Este método no se usará, pero lo mantenemos por si decides utilizarlo más adelante
    public List<Articulo> listarArticulos() {
        return new ArrayList<>(); // Devuelve una lista vacía
    }
     
}