/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.List;
import modelo.Stock;

/**
 *
 * @author virgi
 */
public interface StockDAO {
    
    int save(Stock stock);
    int update(Stock stock);
    int delete(int id);
    List<Stock> getAll();
    Stock getById(int id);
    
    
    
}
