/*
 * Commit # 3
 * commit # 4
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class EmployeeTest {
    public static void main(String args[]){
        Employee [] empList = new Employee[2];
        Employee temp = new Employee("Jeff","a345",50000);
        empList[0]=temp;
        empList[1]=new Employee("Alex","b567",109300);
        
        for(Employee e: empList){
            System.out.println(e.getName());
        }
    }
}
