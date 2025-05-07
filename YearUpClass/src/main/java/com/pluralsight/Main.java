package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Jane", "Doe", "jane.doe@example.com", "female");

        // Print information about the person
        System.out.println("Person:");
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Gender: " + person.getGender());
        System.out.println(); // line break

        Student student = new Student(
               "Abraham",                     // First name
                "Ghani",                                // Last name
                "GhaniA@YUU.org",                       // Email
                "Male",                                 // Gender
                 100,                                   // Id
                "https://github.com/AbrahamGhani",      // GitHub link
                "https://www.linkedin.com/in/abraham-ghani/",       // LinkedIn profile
                "Honest Abe",                           // Coding nickname
                "0",                                    // Codewars XP (as String)
                "https://media.licdn.com/dms/image/v2/D5635AQEgY2g8PpsMsA/profile-framedphoto-shrink_200_200/B56ZXYdMM6GcAc-/0/1743093286744?e=1747242000&v=beta&t=0rsfrMrN5xj7RBawigZ_042H2Gpk5L-O6vc7WDZwDII",      // Image URL
                "Windows",                              // Device type
                0,                                      // Workbook page number
                "Java Class"                                    // Currently working on (page/task)
        );


// Print information about the student
        System.out.println("Student:");
        System.out.println("Full Name: " + student.getFullName());
        System.out.println("Id: " + student.getId());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Nickname: " + student.getCodingNickname());
        System.out.println("GitHub: " + student.getGithub());
        System.out.println("LinkedIn: " + student.getLinkedin());
        System.out.println("Device: " + student.getDeviceType());
        System.out.println("Currently Working On: " + student.getCurrentlyWorkingOn());

    }
}