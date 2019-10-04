package sns.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sns.member.db.MemberDAO;

public class EmailCheckAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("EmailCheckAction_execute()");
		
		String email = request.getParameter("email");
		System.out.println("action - email: " + email);
		
		MemberDAO mdao = new MemberDAO();
		int check = mdao.emailCheck(email);
		
		PrintWriter print = response.getWriter();
		print.println(check);
		print.close();
		
		return null;
	}

}
