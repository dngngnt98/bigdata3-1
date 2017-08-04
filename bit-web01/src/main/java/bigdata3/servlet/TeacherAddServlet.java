package bigdata3.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bigdata3.domain.Teacher;
import bigdata3.service.TeacherService;

@WebServlet(urlPatterns="/teacher/add")
public class TeacherAddServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    Teacher t = new Teacher();
    t.setName(req.getParameter("name"));
    t.setTel(req.getParameter("tel"));
    t.setEmail(req.getParameter("email"));
    t.setPassword(req.getParameter("password"));
    t.setHomepage(req.getParameter("homepage"));
    t.setFacebook(req.getParameter("facebook"));
    t.setTwitter(req.getParameter("twitter"));
    
    try {
      TeacherService teacherService = 
          (TeacherService)this.getServletContext().getAttribute("teacherService");   
      teacherService.add(t);
      
      res.sendRedirect("list");
      
    } catch (Exception e) {
      req.setAttribute("error", e); 
      RequestDispatcher rd = req.getRequestDispatcher("/error");
      rd.forward(req, res);
      return;
    }
    
  }
}









