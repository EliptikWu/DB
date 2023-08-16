package domain;

import repository.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Impl implements Repository {

    @Override
    public List list() {
        return null;
    }

    @Override
    public Object byId(Long id) {
        return null;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void delete(Long id) {

    }
    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }
    private Producto createProduct(ResultSet resultSet) throws
            SQLException {
        return getProducto(resultSet);
    }

    @Override
    public List<Producto> list() {
        List<Producto> productoList = new ArrayList<>();
        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT *
                     from productos")) {
        while (resultSet.next()) {
            Producto producto = createProduct(resultSet);
            productoList.add(producto);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return productoList;

    @Override
    public List<Add> list(){
        List<Add> addList = new ArrayList<>();
        try (Statement statement = getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT *
                from productos")) {
        while (resultSet.next()) {
            Producto producto = createProduct(resultSet);
            productoList.add(producto);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return addList;

    }
}


