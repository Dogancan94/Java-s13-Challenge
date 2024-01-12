package employeeApp.model;

import java.util.Arrays;

//POJO(Plain Old Java Object)
public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    //Method Signature(Employee(int,String)
    //Constructor Overloading

    //boilerplate code
    public Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    //4, BASIC
    //(4, "Mahmut")
    //new String[4] => healthplans = [BASIC, MEDIUM, null, null]
    public void addHealthPlan(int index, String name) {
        //guarding
        if (index < 0) {
            System.out.println("Index değeri 0'dan küçük olamaz");
        } else {
            try {
                //name => A Sigorta
                //healtplans => A Sigorta, B Sigorta,

                boolean isExist = false;
                for(String healthplan: healthPlans){
                    if(healthplan != null && healthplan.equals(name)){
                        isExist = true;
                        System.out.println(name + " healtplans içerisinde vardır.");
                        break;
                    }
                }

                //healthPlans[4]
                if(!isExist){
                    if(healthPlans[index] == null){
                        healthPlans[index] = name;
                    } else {
                        System.out.println("İlgili index doludur. " + index);
                    }
                }

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid index: " + index);
            } catch (Exception exception){
                System.out.println("Error occured: " + exception.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
