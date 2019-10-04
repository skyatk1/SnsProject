package sns.member.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MemberController extends HttpServlet{
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		StringBuffer requestURL = request.getRequestURL();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		System.out.println("command: " + command);
		
		Action action = null;
		ActionForward forward = null;
		
		if(command.equals("/Login.me")){
			
		} else if (command.equals("/winku/EmailCheck.me")) {
			action = new EmailCheckAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/winku/JoinMember.me")) {
			action = new JoinMemberAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if (command.equals("/authenticationCode.me")) {
			// 인증하면 메일로 인증코드 -> 세션으로 설정해서 잠깐 저장
			// 입력한 값이랑 비교해서 완료가되면 해당 세션 삭제.
			forward.setPath("./authenticationCode.jsp");
			forward.setRedirect(false);
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
}
