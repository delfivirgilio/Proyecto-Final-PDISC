
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Stock;
import dao.StockDAO;
import dao.StockDAOimpl;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "stockSERVLET", urlPatterns = {"/stockSERVLET"})
public class stockSERVLET extends HttpServlet {

        StockDAO stockDAO = new StockDAOimpl();
    
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if(accion == null || accion.isEmpty()){
            //ir a la lista
            ListarProductos(request, response);
            
        }else{
            switch (accion) {
                case "nuevo":
                    nuevoProducto(request, response);
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Stock stock = null;
        String id = request.getParameter("id");        
        String codigo = request.getParameter("codigo"); 
        String marca = request.getParameter("marca");   
        String producto = request.getParameter("producto");   
        String precio = request.getParameter("precio");   
        String stockL = request.getParameter("stockL");   
        String vendidos = request.getParameter("vendidos");   
        if(id == null || id.isEmpty()){
            stock = new Stock(codigo,marca,producto,precio,stockL,vendidos);
            stockDAO.save(stock);
            ListarProductos(request, response);
            
        }else{
            
            stock = new Stock(id,codigo,marca,producto,precio,stockL,vendidos);
            stockDAO.update(stock);
            ListarProductos(request,response);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void ListarProductos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<Stock> list = new ArrayList<>();
        
        list = stockDAO.getAll();
        request.setAttribute("list", list);
        
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    private void nuevoProducto(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("formProducto.jsp");
    }

}
