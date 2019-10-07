package sns.member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sns.member.db.MemberDAO;
import sns.member.db.MemberDTO;

public class JoinMemberAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("JoinmemberAction_execute()");
		
		MemberDTO mdto = new MemberDTO();
		mdto.setEmail(request.getParameter("email"));
		mdto.setPassword(request.getParameter("pass"));
		mdto.setFirstName(request.getParameter("f_name"));
		mdto.setLastName(request.getParameter("l_name"));
		mdto.setGender(request.getParameter("gender"));
		
		MemberDAO mdao = new MemberDAO();
		mdao.insertMember(mdto);
		
		return null;
	}

}
