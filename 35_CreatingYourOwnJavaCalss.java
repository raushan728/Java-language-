class Employee {
    int id;
    String name;
    int Sal;

    public void PrintDetails() {
        System.out.println("My id is " + id);
        System.out.println("And my name is " + name);
        System.out.println("My salary is " + Sal);
    }
}

public class CreatingYourOwnJavaCalss {

    public static void main(String[] args) {
        System.out.println(("This is our custom class"));
        Employee Raushan = new Employee();
        Raushan.id = 12;
        Raushan.name = "Raushan singh";
        Raushan.Sal = 70000;
        Raushan.PrintDetails();
        Employee Rahul = new Employee();
        Rahul.id = 40;
        Rahul.name = "Rahul Laxari";
        Rahul.Sal = 2000;
        Rahul.PrintDetails();

    }
}
