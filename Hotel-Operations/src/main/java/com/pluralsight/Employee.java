package com.pluralsight;

public class Employee {

    /*
getTotalPay
getRegularHours
getOvertimeHours
     */
    long employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;

    public Employee(long employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee() {
    }


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours(){
        double regularHours;
        if (this.hoursWorked >= 40){
            regularHours = 40;
        }else {
            regularHours = hoursWorked;
        }
        return regularHours;
    }

    public double getOvertimeHours(){
        double overtimeHours;
        if (this.hoursWorked >= 40){
            overtimeHours = hoursWorked - 40;
        }else {
            overtimeHours = 0;
        }
        return overtimeHours;
    }

    public double getTotalPay(){
        return (getRegularHours() * getPayRate()) + (getOvertimeHours() * (getPayRate() * 1.5));
    }

}
