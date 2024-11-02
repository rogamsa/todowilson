/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sistema.demo.Controller;

import com.Sistema.demo.model.Reclamo;
import com.Sistema.demo.repository.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Diego
 */

@Controller
public class ReclamoController {
    
    @Autowired
    private ReclamoRepository reclamoRepository;
    
    @GetMapping("/reclamos")
    public String mostrarFormularioReclamo() {
        return "Reclamos"; // Devuelve la vista para el formulario de reclamos
    }

    @RequestMapping(value="/guardar_reclamo",method=RequestMethod.POST)
    public String guardarReclamo(@RequestParam("articuloId") int articuloId,
                                  @RequestParam("comentario") String comentario,
                                  Model model) {
         Reclamo nuevoReclamo = new Reclamo();
        nuevoReclamo.setArticulo_id(articuloId);
        nuevoReclamo.setComentario(comentario);
        nuevoReclamo.setFecha_reclamo(new java.sql.Timestamp(System.currentTimeMillis()));


        reclamoRepository.save(nuevoReclamo);       
        return "Index"; // Redirige a la vista principal después de guardar el reclamo
    }
}

