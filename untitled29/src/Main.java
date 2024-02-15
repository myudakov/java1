public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Мирошкин Дмитрий Витальевич", "Дизайнер", "miroshkindmity@gmail.com", "7999999999",
                66000, 18);
        employees[1] = new Employee("Юдаков Михаил Юревич", "Программист", "yudakovmikhail@gmail.com", "78888888888", 66000, 18);
        employees[2] = new Employee("Иванов Иван", "Инженер","ivivan@mailbox.com" ,"892312312", 30000, 30);
        employees[3] = new Employee("Владимир Владимирович", "???", "vv@gmail.com", "77777777777", 100000, 71);
        employees[4] = new Employee("Евгений Викторович", "???", "prgzhn@gmail.com", "76666666666", 95000, 66);

        for (Employee employee : employees){
            if (employee.getAge() > 40){
                employee.displayInfo();
            }
        }
    }
}

