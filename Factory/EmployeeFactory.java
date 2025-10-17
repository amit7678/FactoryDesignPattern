package org.example.Factory;

public class EmployeeFactory {
    public  static Employee getEmployee(String empType){
        if (empType == null || empType.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee type must not be null or empty.");
        }

        if(empType.trim().equalsIgnoreCase("FrontEndDeveloper")){
            return new FrontEndDeveloper();
        }else if(empType.trim().equalsIgnoreCase("JavaFullStackDeveloper")){
            return  new JavaFullStackDeveloper();
        }else if(empType.trim().equalsIgnoreCase("MernStackDeveloper")){
            return new MernStackDeveloper();
        }else{
            throw new IllegalArgumentException("Unknown employee type: " + empType);
        }

    }

}
