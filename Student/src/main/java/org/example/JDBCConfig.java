package org.example;


import org.example.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JDBCConfig
{

    @Bean("ds")
    public DriverManagerDataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("abcd69");

        return ds;
    }


    @Bean("template")
    public JdbcTemplate getTemplate()
    {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }


    @Bean("studentDao")
    public StudentDaoImpl getStudentDao()
    {
        StudentDaoImpl ss = new StudentDaoImpl();
        ss.setTemplate(getTemplate());
        return ss;
    }
}
