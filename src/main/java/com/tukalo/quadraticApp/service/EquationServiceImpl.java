package com.tukalo.quadraticApp.service;

import com.tukalo.quadraticApp.DAO.EquationDAO;
import com.tukalo.quadraticApp.model.Equation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EquationServiceImpl implements EquationService {
    private EquationDAO equationDAO;

    @Autowired
    public EquationServiceImpl(EquationDAO equationDAO) {
        this.equationDAO = equationDAO;
    }

    @Transactional
    @Override
    public void add(Equation equation) {
        this.equationDAO.add(equation);
    }

    @Transactional
    @Override
    public List<Equation> findAll() {
        return this.equationDAO.findAll();
    }
}
