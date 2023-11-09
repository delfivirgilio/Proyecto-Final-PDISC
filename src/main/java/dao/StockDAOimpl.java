/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Stock;
import util.DBConnection;


/**
 *
 * @author virgi
 */
public class StockDAOimpl implements StockDAO {
    
    private String sql = "";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
            
            

    @Override
    public int save(Stock stock) {
        int row=0;
        
        sql="INSERT INTO stock(id,codigo,marca,producto,precio,stock,vendidos) VALUES (?,?,?,?,?,?,?)";
        connection = DBConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,stock.getId());
            preparedStatement.setInt(2,stock.getCodigo());
            preparedStatement.setString(3,stock.getMarca());
            preparedStatement.setInt(4,stock.getPrecio());
            preparedStatement.setString(5,stock.getProducto());
            preparedStatement.setInt(6,stock.getStockL());
            preparedStatement.setInt(7,stock.getVendidos());
            row = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return row;
    }

    @Override
    public int update(Stock stock) {
        int row = 0;
        
        sql="UPDATE stock SET codigo = ?,marca = ?,precio = ?,producto = ?,stock = ?,vendidos = ? WHERE id = ?";
        connection = DBConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,stock.getId());
            preparedStatement.setInt(2,stock.getCodigo());
            preparedStatement.setString(3,stock.getMarca());
            preparedStatement.setInt(4,stock.getPrecio());
            preparedStatement.setString(5,stock.getProducto());
            preparedStatement.setInt(6,stock.getStockL());
            preparedStatement.setInt(7,stock.getVendidos());
            row = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return row;
        
    }

    @Override
    public int delete(int id) {
        int row = 0;
        
        sql = "DELETE FROM stock WHERE id = ?";
        connection = DBConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return row;
        
    }

    @Override
    public List<Stock> getAll() {
        List<Stock> list = new ArrayList();
        sql = "SELECT * FROM stock";
        connection = DBConnection.getConnection();
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Stock stock = new Stock();
                stock.setId(resultSet.getInt(1));
                stock.setCodigo(resultSet.getInt(2));
                stock.setMarca(resultSet.getString(3));
                stock.setProducto(resultSet.getString(4));
                stock.setPrecio(resultSet.getInt(5));
                stock.setStockL(resultSet.getInt(6));
                stock.setVendidos(resultSet.getInt(7));
                list.add(stock);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
        
        return list;
    }

    @Override
    public Stock getById(int id) {
        Stock stock =  null;
        sql = "SELECT * FROM stock";
        connection = DBConnection.getConnection();
        
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                stock = new Stock();
                stock.setId(resultSet.getInt(1));                
                stock.setCodigo(resultSet.getInt(2));
                stock.setMarca(resultSet.getString(3));
                stock.setProducto(resultSet.getString(4));
                stock.setPrecio(resultSet.getInt(5));
                stock.setStockL(resultSet.getInt(6));
                stock.setVendidos(resultSet.getInt(7));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
        
        return stock;
    }

    private List<Stock> newArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
