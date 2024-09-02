package com.practica.banco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.banco.dtos.CuentaDTO;
import com.practica.banco.services.CuentaService;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

  @Autowired
  private CuentaService cuentaService;

  @GetMapping("/{cuuid}")
  public CuentaDTO getOne(@PathVariable("cuuid") String uuid) {
    return cuentaService.getOne(uuid);
  }

}
