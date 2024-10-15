import java.util.ArrayList;
public class Employee {
    private String name;
    private float salary;
    private ArrayList <Allocation> listAllocation;
    private ArrayList <Tel> telList; 

    public Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
        this.listAllocation = new ArrayList<>();
        this.telList = new ArrayList<>();
    }

    public void addEmployee(Allocation allocation){
        listAllocation.add(allocation);
    }
    public void removeProject(Allocation allocation){
        listAllocation.remove(allocation);
    }

    public void addTel(Tel tel){
        telList.add(tel);
    }
    public void removeTel(Tel tel){
        telList.remove(tel);
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public ArrayList<Allocation> getListAllocation() {
        return listAllocation;
    }

    public ArrayList<Tel> getTelList() {
        return telList;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", listAllocation=" + listAllocation + ", telList="
                + telList + "]";
    }

    
}
