package com.tukalo.quadraticApp.DAO;

import com.tukalo.quadraticApp.model.Equation;
import com.tukalo.quadraticApp.rowMapper.EquationRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EquationDAOImpl implements EquationDAO {

    private Logger logger = LoggerFactory.getLogger(EquationDAOImpl.class);
    private final JdbcTemplate jdbcTemplate;

    public EquationDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void add(Equation equation) {
        String query = "INSERT INTO equations(coefA,coefB,coefC,result,result2) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(query, equation.getCoefA(), equation.getCoefB(), equation.getCoefC(), equation.getResult(), equation.getResult2());
        logger.info("Equation successfully added. Equation details: Коефициент a - {}, Коефициент b - {}, Коефициент c - {}, x1 - {}, x2 - {}",equation.getCoefA(),equation.getCoefB(),equation.getCoefC(),equation.getResult(),equation.getResult2());
    }

    @Override
    public List<Equation> findAll() {
        String query = "SELECT * FROM equations";
        RowMapper<Equation> rowMapper = new EquationRowMapper();
        logger.info("Equation list successfully loaded");
        return jdbcTemplate.query(query, rowMapper);
    }
}
