/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.FoodWorkQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    private String Email;
    private Role role;
    private WorkQueue workQueue;
    private FoodWorkQueue foodWorkQueue; 

    public UserAccount() {
        workQueue = new WorkQueue();
        foodWorkQueue = new FoodWorkQueue();
 
    }

    public FoodWorkQueue getFoodWorkQueue() {
        return foodWorkQueue;
    }

    public void setFoodWorkQueue(FoodWorkQueue foodWorkQueue) {
        this.foodWorkQueue = foodWorkQueue;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}