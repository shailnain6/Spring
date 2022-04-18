package dev.nain.services;

import dev.nain.models.EmployeeDTO;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    public void insert(EmployeeDTO emp){
        employeeDAO.insertEmployee(emp);
    }

    public void delete(int empId){
        employeeDAO.removeEmployee(empId);
    }

    public List<EmployeeDTO> getAllCustomer(){
        return employeeDAO.fetchCustomer();
    }
}
