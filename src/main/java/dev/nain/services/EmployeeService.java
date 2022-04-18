package dev.nain.services;

import dev.nain.models.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    public void insert(EmployeeDTO emp);
    public void delete(int empId);
    public List<EmployeeDTO> getAllCustomer();
}
