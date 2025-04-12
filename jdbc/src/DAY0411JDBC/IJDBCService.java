package DAY0411JDBC;

import java.sql.SQLException;
import java.util.List;

public interface IJDBCService <T> {
	
	void insert(T t) throws ClassNotFoundException, SQLException;
    void update(T t) throws ClassNotFoundException, SQLException;
    void delete(T t) throws ClassNotFoundException, SQLException;
    List<T> selectAll() throws ClassNotFoundException, SQLException;
}
