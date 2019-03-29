package com.tukalo.quadraticApp;


import com.tukalo.quadraticApp.model.Equation;

import java.util.ArrayList;


public class Calculation {
    private static ArrayList<Double> calculate(double coefA, double coefB, double coefC) {
        double d;
        double x1, x2;
        System.out.println("COEF A -------" + coefA);
        d = Math.pow(coefB, 2) - (4 * coefA * coefC);
        ArrayList<Double> result = new ArrayList<>();
        if (d > 0) {
            x1 = ((-1) * coefB - Math.sqrt(d)) / (2 * coefA);
            x2 = ((-1) * coefB + Math.sqrt(d)) / (2 * coefA);
            result.add(x1);
            result.add(x2);
            return result;
        } else if (d == 0) {
            x1 = (-1) * coefB;
            result.add(x1);
            return result;
        } else
            return null;
    }

    public static Equation resultEquation(Equation equation) {
        if (equation.getCoefA() == 0) {
            equation.setCoefA(1);
        }
        if (equation.getCoefB() == 0) {
            equation.setCoefB(1);
        }
        if (equation.getCoefC() == 0) {
            equation.setCoefC(1);
        }
        ArrayList<Double> eresult = calculate(equation.getCoefA(), equation.getCoefB(), equation.getCoefC());
        double x1, x2;
        try {
            if (eresult.size() > 1) {
                x1 = eresult.get(0);
                x2 = eresult.get(1);
                equation.setResult(x1);
                equation.setResult2(x2);
            } else {
                x1 = eresult.get(0);
                equation.setResult(x1);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            equation.setResult(0);
            equation.setResult2(0);
        }
        return equation;
    }
}
