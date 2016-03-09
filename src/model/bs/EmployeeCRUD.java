package model.bs;
/*
*@author Mitodru
**
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.ConnectDAO;
import model.entity.Employee_3908489;

public class EmployeeCRUD {
	public int addEmployee(Employee_3908489 obj)
	{
		int row=0;
		Connection con=new ConnectDAO().doConnect();
		if(con==null)
		{
			System.out.println("Connection did not established");
			return row;
		}
		try
		{
			PreparedStatement pst=con.prepareStatement("insert into employee_3908489 values(?,?,?,?)");
			pst.setString(1,obj.getEmpNo());
			pst.setString(2,obj.getEmpName());
			pst.setString(3,obj.getJob());
			pst.setString(4,obj.getMgrId());
			row=pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return row;
	}
	
	public int updateEmployee(Employee_3908489 obj)
	{
		int row=0;
		Connection con=new ConnectDAO().doConnect();
		if(con==null)
		{
			System.out.println("Connection did not established");
			return row;
		}
		try
		{
			PreparedStatement pst=con.prepareStatement("update employee_3908489 set EMPNAME=?,JOB=?,MGRID=? where EMPNO=?");
			pst.setString(1,obj.getEmpName());
			pst.setString(2,obj.getJob());
			pst.setString(3,obj.getMgrId());
			pst.setString(4,obj.getEmpNo());
			row=pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return row;
	}
	
	public int deleteEmployee(Employee_3908489 obj)
	{
		int row=0;
		Connection con=new ConnectDAO().doConnect();
		if(con==null)
		{
			System.out.println("Connection did not established");
			return row;
		}
		try
		{
			PreparedStatement pst=con.prepareStatement("delete from employee_3908489  where EMPNO=?");
			pst.setString(1,obj.getEmpNo());
			row=pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return row;
	}
	
	public boolean viewEmployee(Employee_3908489 obj)
	{
		ResultSet rs=null;
		boolean flag=false;
		Connection con=new ConnectDAO().doConnect();
		if(con==null)
		{
			System.out.println("Connection did not established");
			return flag;
		}
		try
		{
			PreparedStatement pst=con.prepareStatement("select * from employee_3908489  where EMPNO=?");
			pst.setString(1,obj.getEmpNo());
			rs=pst.executeQuery();
			while(rs.next())
			{
				obj.setEmpName(rs.getString("EMPNAME"));
				obj.setJob(rs.getString("JOB"));
				obj.setMgrId(rs.getString("MGRID"));
				flag=true;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	public ArrayList<Employee_3908489> viewAllEmployee()
	{
		ResultSet rs=null;
		ArrayList<Employee_3908489> als=new ArrayList<Employee_3908489>();
		Connection con=new ConnectDAO().doConnect();
		if(con==null)
		{
			System.out.println("Connection did not established");
			return als;
		}
		try
		{
			PreparedStatement pst=con.prepareStatement("select * from employee_3908489 order by EMPNO");
			rs=pst.executeQuery();
			while(rs.next()){
				Employee_3908489 e=new Employee_3908489();
				e.setEmpNo(rs.getString("EMPNO"));
				e.setEmpName(rs.getString("EMPNAME"));
				e.setJob(rs.getString("JOB"));
				e.setMgrId(rs.getString("MGRID"));
				als.add(e);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return als;
	}
}
