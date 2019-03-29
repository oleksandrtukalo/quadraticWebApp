package com.tukalo.quadraticApp.model;

import javax.persistence.*;

@Entity
@Table(name = "equations")
public class Equation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "coefA")
    private double coefA;
    @Column(name = "coefB")
    private double coefB;
    @Column(name = "coefC")
    private double coefC;
    @Column(name = "result")
    private double result;
    @Column(name = "result2")
    private double result2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCoefA() {
        return coefA;
    }

    public void setCoefA(double coefA) {
        this.coefA = coefA;
    }

    public double getCoefB() {
        return coefB;
    }

    public void setCoefB(double coefB) {
        this.coefB = coefB;
    }

    public double getCoefC() {
        return coefC;
    }

    public void setCoefC(double coefC) {
        this.coefC = coefC;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult2() {
        return result2;
    }

    public void setResult2(double result2) {
        this.result2 = result2;
    }
}
