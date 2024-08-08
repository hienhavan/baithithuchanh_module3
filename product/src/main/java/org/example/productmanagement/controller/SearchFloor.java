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

@WebServlet(name = "searchFloor", urlPatterns = "/SearchFloor")
public class SearchFloor extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int tang = Integer.parseInt(req.getParameter("tang"));
        String vanPong = req.getParameter("loaiVanPhong");
        List<OfficedbDTO> list = new ArrayList<OfficedbDTO>();
        try {
            list = OfficeDBDao.searchOfficeFloor(tang, vanPong);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("listOffice", list);
        req.getRequestDispatcher("/offices/list_offices.jsp").forward(req, resp);

    }
}
