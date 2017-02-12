/**
 * Created by xuyue on 04/02/17.
 */
public class TestEmployee {

   public static void main(String[] args){
       Employee xuyue = new Employee();
       xuyue.setSalary(100);

       xuyue.bonus = 30;
       xuyue.calculateTotalPay();

       //get method

       System.out.println("Xuyue's salary" + xuyue.getsalary());

   }




}
