package com.pluralsight;

public class NameFormatter {

    String prefix;
    String firstName;
    String middleName;
    String lastName;
    String suffix;

    private NameFormatter(String prefix, String firstName, String middleName, String lastName, String suffix) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return String.format("%s. %s %s %s, %s",prefix,firstName,middleName,lastName,suffix);
    }

    public static String format(String firstName,  String lastName) {
        return String.format("%s %s",firstName,lastName);
    }

    public static String format(String fullName) {
       String[] parts = fullName.split(" ");
       String firstName = parts[0];
       String middleName = parts[1];
       String lastName = parts[2];

        return String.format("%s %s %s",firstName,middleName,lastName);
    }

}
