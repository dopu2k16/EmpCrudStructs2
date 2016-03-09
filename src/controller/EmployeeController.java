package controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import model.bs.EmployeeCRUD;
import model.entity.Employee_3908489;

/**
 * Servlet implementation class EmployeeController
 *@author Mitodru
 */
public class EmployeeController{
	
		public String addEmployee()
		{
		
			HttpServletRequest request=ServletActionContext.getRequest();
			String url=null;
			Employee_3908489 obj=new Employee_3908489();
			obj.setEmpNo(request.getParameter("empNo"));
			obj.setEmpName(request.getParameter("empName"));
			obj.setJob(request.getParameter("job"));
			obj.setMgrId(request.getParameter("mgrId"));
			EmployeeCRUD obj1=new EmployeeCRUD();
			int row=obj1.addEmployee(obj);
			if(row==1)
			{
				url="addEmployeeSuccess";
			}
			else
			{
				url="addEmployeeError";
			}
			return url;
		}
		public String updateEmployee()
		{

			HttpServletRequest request=ServletActionContext.getRequest();
			String url=null;
			Employee_3908489 obj=new Employee_3908489();
			obj.setEmpNo(request.getParameter("empNo"));
			obj.setEmpName(request.getParameter("empName"));
			obj.setJob(request.getParameter("job"));
			obj.setMgrId(request.getParameter("mgrId"));
			EmployeeCRUD obj1=new EmployeeCRUD();
			int row=obj1.updateEmployee(obj);
			if(row==1)
			{
				url="updateEmployeeSuccess";
			}
			else
			{
				url="updateEmployeeError";
			}
			return url;
		}
		public String deleteEmployee()
		{
			HttpServletRequest request=ServletActionContext.getRequest();
			String url=null;
			Employee_3908489 obj=new Employee_3908489();
			obj.setEmpNo(request.getParameter("empNo"));
			EmployeeCRUD obj1=new EmployeeCRUD();
			int row=obj1.deleteEmployee(obj);
			if(row==1)
			{
				url="deleteEmployeeSuccess";
			}
			else
			{
				url="deleteEmployeeError";
			}
			return url;
		}
		public String viewEmployee()
		{
			HttpServletRequest request=ServletActionContext.getRequest();
			String url=null;
			Employee_3908489 obj=new Employee_3908489();
			obj.setEmpNo(request.getParameter("empNo"));
			EmployeeCRUD obj1=new EmployeeCRUD();
			boolean flag=obj1.viewEmployee(obj);
			request.setAttribute("details", obj);
			if(flag)
			{
				url="viewEmployeeSuccess";
			}
			else
			{
				url="viewEmployeeError";
			}
			return url;
		}
		
		public String viewAllEmployee()
		{

			HttpServletRequest request=ServletActionContext.getRequest();
			String url=null;
			EmployeeCRUD obj1=new EmployeeCRUD();
			ArrayList<Employee_3908489> al=obj1.viewAllEmployee();
			request.setAttribute("details", al);
			
			if(al!=null)
			{
				url="viewAllEmployee";
			}
			else
			{
				url="viewEmployeeError";
			}
			return url;
		}
	

}
