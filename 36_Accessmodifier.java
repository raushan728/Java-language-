class Employee {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class Accessmodifier {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setName("Raushan");
        System.out.println(emp1.getName());
        emp1.setId(402);
        System.out.println(emp1.getId());

    }
}
