package com.jd.shop.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("name", "tom");
        List<Integer> nums = Arrays.asList(14, 26, 33);
        req.setAttribute("nums", nums);

        /*示例：获取资源文件*/
        Properties pro = new Properties();
        pro.load(HelloServlet.class.getClassLoader().getResourceAsStream("stu.properties"));
        req.setAttribute("age", pro.getProperty("age"));
        req.setAttribute("name", pro.getProperty("name"));
        req.setAttribute("sexy", pro.getProperty("sexy"));

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
