public class Tel {
    private int ddd;
    private int num;
    private Employee employee;

    public Tel(int ddd, int num, Employee employee){
        this.ddd = ddd;
        this.num = num;
        this.employee = employee; 
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNum() {
        return num;
    }

    public Employee getEmployee() {
        return employee;
    }
}
