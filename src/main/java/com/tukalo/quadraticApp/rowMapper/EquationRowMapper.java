package com.tukalo.quadraticApp.rowMapper;

import com.tukalo.quadraticApp.model.Equation;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EquationRowMapper implements RowMapper<Equation> {
    @Nullable
    @Override
    public Equation mapRow(ResultSet rs, int rowNum) throws SQLException {
        Equation equation = new Equation();
        equation.setId(rs.getInt("id"));
        equation.setCoefA(rs.getInt("coefa"));
        equation.setCoefB(rs.getInt("coefb"));
        equation.setCoefC(rs.getInt("coefc"));
        equation.setResult(rs.getDouble("result"));
        equation.setResult2(rs.getDouble("result2"));
        return equation;
    }
}
