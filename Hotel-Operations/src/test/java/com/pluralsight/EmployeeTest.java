package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {

    @Test
    public void testPunchInSetsCorrectTime() {
        // Arrange
        Employee emp = new Employee();

        // Act
        emp.punchIn(9.5); // 9:30 AM

        // Assert
        assertEquals(9.5, emp.getPunchIn());
    }

    @Test
    public void testPunchOutSetsCorrectTime() {
        // Arrange
        Employee emp = new Employee();

        // Act
        emp.punchOut(17.0); // 5:00 PM

        // Assert
        assertEquals(17.0, emp.getPunchOut()); // Again, a getter would help
    }



}