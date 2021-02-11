/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;


/**
 *
 * @author Balarubinan
 */
//@WebServlet(urlPatterns = {"/HelloServerlet"})
//public class HelloServerlet extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet HelloServerlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet HelloServerlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
@WebServlet(urlPatterns = {"/HelloServerlet"})
public class HelloServerlet extends javax.servlet.GenericServlet{
    @Override
    public void service(ServletRequest request,
            ServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
//        try (PrintWriter pw = response.getWriter()) {
//            pw.println("<B> Hello degeg Bala this shit works");
//        }
//        RequestDispatcher rd = request.getRequestDispatcher("/index.html");
//        rd.forward(request, response);
          try (PrintWriter pw=response.getWriter()){
              // Check how to use relative path to file!!
              Scanner s=new Scanner(new File("C:\\Users\\Balarubinan\\Documents\\NetBeansProjects\\WebApplication2\\src\\java\\Static_pages\\newhtml.html"));
              System.out.println("Until Scanneing!!1");
              while(s.hasNextLine()){
               String content=s.nextLine();
               System.out.println(content);
               pw.println(content);
              }
              pw.println("<a>HEll</a>");
          }
          catch(Exception e){
              System.out.println("Ehllo in error");
              throw new ServletException();
          }
    }
}
