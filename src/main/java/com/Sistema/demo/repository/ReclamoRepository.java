/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Sistema.demo.repository;

import com.Sistema.demo.model.Reclamo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Diego
 */
public interface ReclamoRepository extends JpaRepository<Reclamo, Long> {
}
