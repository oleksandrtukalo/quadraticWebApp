package com.tukalo.quadraticApp.service;

import com.tukalo.quadraticApp.model.Equation;

import java.util.List;

public interface EquationService {
    void add(Equation equation);

    List<Equation> findAll();

}
