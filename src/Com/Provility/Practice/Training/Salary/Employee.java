package Com.Provility.Practice.Training.Salary;
public class Employee {
    private final String emp_name,joining_date,dept;
    private final char desig_code;
    private final int emp_id,basic,hra,it,DA;
    private int GS,netSalary;

    public Employee(int emp_id,String emp_name,String joining_date,char desig_code,String dept,int basic
            ,int DA,int hra,int it){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.joining_date = joining_date;
        this.desig_code = desig_code;
        this.basic = basic;
        this.DA = DA;
        this.dept = dept;
        this.hra = hra;
        this.it = it;

    }

    public String toString(){

            return "Employee details :"+"\n"+ "Emp_Id = "+ emp_id+
                ", Emp_Name = "+emp_name+", Joining_Date = "+ joining_date
                +"\n"+ "Design_Code = "+desig_code +", Dept = " +dept+"\n"
                +"Basic = " + basic+", DA = " + DA+", hra = "
                +hra+", it = "+it+", netSalary = "+getNetSalary();
    }
    public int getNetSalary(){
        return basic + hra + DA -it ;
    }



    public static void main(String[] args) {
        Employee employee1 = new Employee(1001,"Ashish","01/04,2009",'e',"R&D"
                ,20000,20000,8000,3000);
        Employee employee2 = new Employee(1002,"Sushma","23/08/2012",'c',"PM"
                ,30000,32000,12000,9000);
        Employee employee3 = new Employee(1003,"Rahul","12/11/2008",'k'
                ,"Acct",10000,12000,8000,1000);
        Employee employee4 = new Employee(1004,"Chahat","29/01/2013",'r'
                ,"Front Desk",12000,15000,6000,2000);
        Employee employee5 = new Employee(1005,"Ranjan","16/07/2005",'m'
                ,"Engg",50000,40000,20000,20000);
        Employee employee6 = new Employee(1006,"Suman","1/1/2000",'e'
                ,"Manufacturing",23000,20000,9000,4400);
        Employee employee7 = new Employee(1007,"Tanmay","12/06/2006",'c'
                ,"PM",29000,32000,12000,10000);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
        System.out.println(employee7);

    }
}
