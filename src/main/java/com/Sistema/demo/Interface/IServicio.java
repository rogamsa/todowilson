/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Sistema.demo.Interface;

import com.Sistema.demo.model.Compras;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego
 */
@Repository
public interface IServicio extends CrudRepository<Compras,Integer>{
    
}
