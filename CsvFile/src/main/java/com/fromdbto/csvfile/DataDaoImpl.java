package com.fromdbto.csvfile;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DataDaoImpl implements DataDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<MyData> getAllData() {
        String sql = "SELECT * FROM course";
        List<MyData> data = jdbcTemplate.query(sql, (rs, rowNum) -> {
            MyData d = new MyData();
            d.setId(rs.getLong("id"));
            d.setDescription(rs.getString("description"));
            d.setTitle(rs.getString("title"));

            return d;
        });
        return data;
    }
}