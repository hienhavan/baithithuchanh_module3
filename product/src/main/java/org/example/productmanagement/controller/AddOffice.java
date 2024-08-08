package org.example.productmanagement.controller;

import org.example.productmanagement.model.OfficeDBDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "add",urlPatterns = "/addOffices")
public class AddOffice extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ma = req.getParameter("maMB");
        int dienTich = Integer.parseInt(req.getParameter("dienTich"));
        String trangThai = req.getParameter("trangThai");
        int tang = Integer.parseInt(req.getParameter("tang"));
        String loaiVanPhong = req.getParameter("loaiVanPhong");
        long giaChoThue = Long.parseLong(req.getParameter("giaChoThue"));
        String ngayBatDau = req.getParameter("ngayBatDau");
        String ngayKetThuc = req.getParameter("ngayKetThuc");
        OfficeDBDao.addOffice(ma, dienTich, trangThai, tang, loaiVanPhong, giaChoThue, ngayBatDau, ngayKetThuc);
        resp.sendRedirect("/controllerShowListOffice");
    }
}
