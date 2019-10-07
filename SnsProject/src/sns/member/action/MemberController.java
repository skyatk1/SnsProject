package sns.member.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sns.member.action.ActionForward;


public class MemberController extends HttpServlet{
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		StringBuffer requestURL = request.getRequestURL();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		System.out.println("requestURI: " + requestURI);
		System.out.println("contextPath: " + contextPath);
		System.out.println("command: " + command);
		
		Action action = null;
		ActionForward forward = null;
		
		if(command.equals("/Login.me")){
			forward = new ActionForward();
			
			forward.setPath("./member/login.jsp");
			forward.setRedirect(false);
			
		} else if (command.equals("/EmailCheck.me")) {
			action = new EmailCheckAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/JoinMember.me")) {
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
		
		
		if (forward != null) {
			// 페이지 이동정보가 있다
			if (forward.isRedirect()) {
				// 이동방식이 true
				response.sendRedirect(forward.getPath());
			} else {
				// 이동방식이 false
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
			}
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
