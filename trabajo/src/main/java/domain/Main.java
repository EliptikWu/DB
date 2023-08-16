package domain;

import repository.Repository;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            try(Connection conn = ConexionBD.getInstance()){
                Repository<Producto> repository = new
                ProductRepositoryImpl();
                listProducts(repository);
                getProductById(repository);
//addProduct(repository);
//updateProduct(repository);
                deleteProduct(repository);
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


}