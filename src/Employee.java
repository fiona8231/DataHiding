/**
 * Created by xuyue on 04/02/17.
 */
public class Employee {

   private int salary; //private only visible to the class inside

    int bonus;// not private

   void calculateTotalPay(){

       int totalpPay = salary + bonus;

       System.out.println( "Total pay euqal to:" + totalpPay);
   }

   public void setSalary(int salary){

       if(salary <= 200 && salary >=50){
           this.salary = salary;


       } else {
           this.salary = 0;
           System.out.println("Error salary");
       }
   }

   public  int getsalary(){
       return salary;
    }

}
