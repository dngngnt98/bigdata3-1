package bigdata3.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bigdata3.annotation.Component;
import bigdata3.domain.Teacher;
import bigdata3.service.TeacherService;

@Component("/teacher/detail")
public class TeacherDetailControl implements Controller {
  TeacherService teacherService;
  
  public void setTeacherService(TeacherService teacherService) {
    this.teacherService = teacherService;
  }
  
  @Override
  public String service(HttpServletRequest req, HttpServletResponse res) throws Exception {
    int no = Integer.parseInt(req.getParameter("no"));
    Teacher teacher = teacherService.get(no);
    
    if (teacher == null) {
      throw new Exception(no + "번 강사가 없습니다.");
    }
    
    req.setAttribute("teacher", teacher);
    return "/teacher/detail.jsp";
  }
}









