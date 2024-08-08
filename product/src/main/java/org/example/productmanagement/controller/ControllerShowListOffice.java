package org.example.productmanagement.controller;

import org.example.productmanagement.model.DTO.OfficedbDTO;
import org.example.productmanagement.model.OfficeDBDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controllerShowListOffice", urlPatterns = "/controllerShowListOffice")
public class ControllerShowListOffice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<OfficedbDTO> list = new ArrayList<>();
        try {
            list = OfficeDBDao.listOfDTOs();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("listOffice",list);
        req.getRequestDispatcher("/offices/list_offices.jsp").forward(req, resp);
    }
}
