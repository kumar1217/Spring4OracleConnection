package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	public void saveEmployee(Employee employee) {
		persist(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}

	public void deleteEmployeeBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from Employee where emp_id= :ssn");
		query.setInteger("ssn", 5);
		query.executeUpdate();
	}

}
