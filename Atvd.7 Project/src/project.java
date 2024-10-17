import java.util.ArrayList;

public class project{

    private String name;
    private float value;
    private ArrayList <Allocation> listAllocation;

    public project(String name, float value){
        this.name = name;
        this. value = value;
        this.listAllocation = new ArrayList<>();
    }
    
    public void addProject(Allocation allocation){
        listAllocation.add(allocation);
    }

    public void removeProject(Allocation allocation){
        listAllocation.remove(allocation);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    public ArrayList<Allocation> getListAllocation() {
        return listAllocation;
    }

    public void setListAllocation(ArrayList<Allocation> listAllocation) {
        this.listAllocation = listAllocation;
    }

    
}
