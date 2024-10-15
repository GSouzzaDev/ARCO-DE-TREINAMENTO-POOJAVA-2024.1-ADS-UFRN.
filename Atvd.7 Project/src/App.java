public class App {
    public static void main(String[] args) throws Exception {
        project project1 = new project("projetao", 999f);
        Employee employee1 = new Employee("Gustavo", 1.300f);
        Allocation allocation1 = new Allocation(4, project1, employee1);
        Tel tel1 = new Tel(84, 981558888, employee1); 

        employee1.addEmployee(allocation1);
        employee1.addTel(tel1);
        
        project1.addProject(allocation1);

        project1.removeProject(allocation1);
        employee1.removeEmployee(allocation1);
        employee1.removeTel(tel1);
        
    }

    
}
