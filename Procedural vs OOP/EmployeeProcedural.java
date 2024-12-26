class EmployeeProcedural {
    public static void main(String[] args) {
       
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ids = {101, 102, 103};
        double[] salaries = {50000, 60000, 70000};

        for (int i = 0; i < names.length; i++) {

            double newSalary = addBonus(salaries[i], 5000);
            System.out.println("ID: " + ids[i] + ", Name: " + names[i] + ", New Salary: " + newSalary);

        }
    }

        public static double addBonus(double salary, double bonus) {
        return salary + bonus;
    }
}
