package com.gam.restaurant.controller.foodServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MohammadReza on 4/1/2018.
 */
@WebServlet(name = "/menu.jsp")
public class FoodRegister extends javax.servlet.http.HttpServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        String food_id=request.getParameter("food_id");
        System.out.println(food_id);
    }
}