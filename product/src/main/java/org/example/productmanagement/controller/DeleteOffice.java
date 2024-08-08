package org.example.productmanagement.controller;

import org.example.productmanagement.model.OfficeDBDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteOffice", urlPatterns = "/delete-premises-form")
public class DeleteOffice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ma = req.getParameter("id");
        try {
            OfficeDBDao.deleteOffices(ma);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/controllerShowListOffice");
    }
}
