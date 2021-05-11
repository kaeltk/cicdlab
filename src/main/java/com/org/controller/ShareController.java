package com.org.controller;
 
 
 
import java.io.IOException;
 
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.org.model.ShareVO;
import com.org.service.ShareService;
import com.org.service.ShareServiceImpl;
 
/**
* Servlet implementation class LoginController
*/
public class ShareController extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
     
        
        
        RequestDispatcher dispatch= request.getRequestDispatcher("/ShareReport.jsp");
           
           ShareService shareService = new ShareServiceImpl();
            List<ShareVO>  shareList= shareService.getAllShares();
             
              request.setAttribute("shareList",shareList );
              
            
         
      dispatch.forward(request,response);
    }
 
   
}
 