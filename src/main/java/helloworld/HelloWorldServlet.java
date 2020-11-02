package helloworld;

import org.apache.http.entity.ContentType;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType(ContentType.TEXT_HTML.getMimeType());

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Hello world from http servlet!");
    }
}
