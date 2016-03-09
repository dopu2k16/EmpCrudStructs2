package controller;
/*
*@author Mitodru
**
*/
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import model.bs.Validator;

public class LoginController{
	
	public String loginAndLogout(){
		String url=null;
		HttpServletRequest request=ServletActionContext.getRequest();
		if(request.getParameter("action").equals("login"))
		{
		Validator valid=new Validator();
		valid.setUserName(request.getParameter("userName"));
		valid.setPassword(request.getParameter("password"));
		if(valid.isValid())
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("userName",valid.getUserName());
			url="successLogin";
		}
		else
		{
			url="errorLogin";
		}
		}
		else if(request.getParameter("action").equals("logout"))
		{
			HttpSession session=request.getSession(false);
			if(session!=null && session.getAttribute("userName")!=null)
			{
				url="successLogout";
			}
			else
			{
				url="errorLogout";
				
			}
		}
		return url;
	}

}
