/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sistema.demo.service;

import com.Sistema.demo.Interface.ICompraService;
import com.Sistema.demo.Interface.IServicio;
import com.Sistema.demo.model.Compras;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
/**
 *
 * @author Diego
 */
@Service
public class CompraService implements ICompraService {
    
    @Autowired
    private IServicio data;
    
   @Override
   public void Guardar(Compras p){
       data.save(p);
   }
   public List<Compras> findAll() {
        return (List<Compras>) data.findAll();
    }
   
}
