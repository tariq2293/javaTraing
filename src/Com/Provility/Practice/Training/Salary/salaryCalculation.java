package Com.Provility.Practice.Training.Salary;

import java.util.Scanner;
public class salaryCalculation{
        String emp_id;
        String emp_name;
        int basicSalary,GS,HRA = 0,DA = 0,incometax = 0,netSalary;

        public void read(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Employee id : ");
            emp_id = scanner.next();
            System.out.println("Enter Employee name :");
            emp_name = scanner.next();
            System.out.println("Enter Employee basicSalary : ");
            basicSalary = scanner.nextInt();
            Calculate();
        }

        public void Calculate(){
            HRA = basicSalary*10/100;
            DA = basicSalary*73/100;
            GS = basicSalary+HRA+DA;
            incometax = GS*30/100;
            netSalary = GS - incometax;
        }

        public void display(){
            System.out.println("Employee id : " + emp_id +"\n"+"Employee name : "
                    + emp_name +"\n"+ "Employee basic Salary : " + basicSalary+"\n"
                    +"Employee HRA : "+ HRA+"\n"+ "Employee DA : "+DA+"\n"+"Employee GS : "
                    + GS +"\n"+ "Employee incometax : "+ incometax +"\n"
                    + "Employee netSalary : "+netSalary);
        }

        public static void main(String[] args){
            salaryCalculation sc = new salaryCalculation();
            sc.read();
            sc.display();
        }
    }


