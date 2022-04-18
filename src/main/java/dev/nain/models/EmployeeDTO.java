package dev.nain.models;

public class EmployeeDTO {
    private int empId;
    private String name;
    private String Department;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        Department = department;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
