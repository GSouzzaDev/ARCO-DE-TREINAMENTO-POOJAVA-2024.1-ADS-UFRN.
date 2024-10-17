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
    public void removeEmployee(Allocation allocation){
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

    public void setListAllocation(ArrayList<Allocation> listAllocation) {
        this.listAllocation = listAllocation;
    }

    public void setTelList(ArrayList<Tel> telList) {
        this.telList = telList;
    }
     
    
}
