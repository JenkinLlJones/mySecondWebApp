package com.fortney.control;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by neil on 4/3/17.
 */

@WebServlet(
        urlPatterns = { "/hello" }
)

public class Hello extends HttpServlet {
    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {

        RequestDispatcher disp = req.getRequestDispatcher( "/hello.jsp" ) ;
        disp.forward( req, resp ) ;
    }
}
