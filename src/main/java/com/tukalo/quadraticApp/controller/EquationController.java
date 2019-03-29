package com.tukalo.quadraticApp.controller;

import com.tukalo.quadraticApp.Calculation;
import com.tukalo.quadraticApp.model.Equation;
import com.tukalo.quadraticApp.service.EquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EquationController {

    private EquationService equationService;

    @Autowired
    public EquationController(EquationService equationService) {
        this.equationService = equationService;
    }

    @RequestMapping(value = "/")
    public ModelAndView home(ModelAndView model) {
        List<Equation> listEquation = equationService.findAll();
        model.addObject("listEquation", listEquation);
        model.setViewName("index");
        return model;
    }

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("equation", "equation", new Equation());
    }

    @RequestMapping(value = "/equationResult", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("equation") Equation equation, ModelMap model) {
        Equation resultEquation = Calculation.resultEquation(equation);
        if (resultEquation.getResult() == 0 && resultEquation.getResult2() == 0) {
            return "error";
        } else {
            model.addAttribute("coefA", resultEquation.getCoefA());
            model.addAttribute("coefB", resultEquation.getCoefB());
            model.addAttribute("coefC", resultEquation.getCoefC());
            model.addAttribute("result", resultEquation.getResult());
            model.addAttribute("result2", resultEquation.getResult2());
            model.addAttribute("id", resultEquation.getId());
            equationService.add(resultEquation);
            return "result";
        }
    }
}

