package com.tony.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/changeLanguage")
public class changeLanguage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public changeLanguage() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lang = request.getParameter("lang");
		String referer = request.getHeader("Referer");
		Cookie language = new Cookie("language", lang);
		language.setMaxAge(60*60*24);
		response.addCookie(language);
		response.sendRedirect(referer);
	}

}
