public class Allocation{
    private int hour;
    private project project;
    private Employee employee;

    public Allocation(int hour, project project, Employee employee){
        this.hour = hour;
        this.project = project;
        this.employee = employee;
    }

    public int getHour() {
        return hour;
    }

    public project getProject() {
        return project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
}
