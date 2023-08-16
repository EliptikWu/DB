package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConexionBD {
    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String user = "root";
    private static String password = "admin";
    private static Connection connection;
    public static Connection getInstance() throws SQLException {
        if(connection==null){
            connection =
                    DriverManager.getConnection(url,user,password);
        }
        return connection;
    }
    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }

    private Producto createProduct(ResultSet resultSet) throws
            SQLException {
        return getProducto(resultSet);
    }

    static Producto getProducto(ResultSet resultSet) throws SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("id"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getDouble("precio"));
        producto.setFechaRegistro(resultSet.getDate("fecha_registro").toLo
                calDate());
        return producto;
    }

}
