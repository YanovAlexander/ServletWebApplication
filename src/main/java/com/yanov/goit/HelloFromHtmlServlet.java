package com.yanov.goit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello-from-html")
public class HelloFromHtmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = "";

        try(final BufferedReader reader = new BufferedReader(new FileReader(req.getServletContext().getRealPath("/html/hello.html")))) {
            String line = "";
            StringBuffer buffer = new StringBuffer();

            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            page = buffer.toString();
        } catch (Exception e) {
            System.err.println("Error" + e);
        }

        resp.getWriter().write(page);
    }
}
