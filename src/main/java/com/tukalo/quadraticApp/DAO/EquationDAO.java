package com.tukalo.quadraticApp.DAO;

import com.tukalo.quadraticApp.model.Equation;

import java.util.List;

public interface EquationDAO {
    void add(Equation equation);

    List<Equation> findAll();

}
