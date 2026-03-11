package com.meuprojeto.core.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import org.osgi.service.component.annotations.Component;

@Component(
    service = Servlet.class,
    property = {
        "sling.servlet.paths=/bin/exemplo",
        "sling.servlet.methods=GET"
    }
)
public class ExemploServlet extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");
        response.getWriter().write("Olá! Servlet funcionando no AEM.");
    }
}
