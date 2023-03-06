public class EmployeeTaskStream {
    public static void main(String[] args) {
        String addBreak = "\n******NEW TASK*******";

        //Print all emails - One employee has one email - One to One
        System.out.println(addBreak);
        EmployeeData.getAllEmployee()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all phone numbers(Stream)
        System.out.println(addBreak);
        EmployeeData.getAllEmployee()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        //Print each phone number as String
        System.out.println(addBreak);
        EmployeeData.getAllEmployee()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
    }
}
