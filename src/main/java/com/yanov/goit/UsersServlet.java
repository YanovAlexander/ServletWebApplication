package com.yanov.goit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getUsers")
public class UsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user1 = new User("Barak", "Obama");
        User user2 = new User("Donald", "Trump");
        req.setAttribute("users", List.of(user1, user2));
        req.getRequestDispatcher("/html/users.jsp").forward(req, resp);
    }
}
