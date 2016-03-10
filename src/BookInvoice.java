import java.util.Scanner;
public class BookInvoice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean complete=false;
		double value;
		String untax;
		Invoice inv=new Invoice();
		
       while(complete==false){
    	   System.out.println("Enter price of item;enter 0 if you finished");
    	   value=sc.nextDouble();
    	   if(value!=0){
    		   System.out.println("Is it taxable?(y/n)");
    		   untax=sc.next();
    		   inv.getInvoice(value, untax);
    	   }else{
    		   complete=true;
    	   }
       }
       System.out.println("taxable subtotal: $"+inv.getTaxable());
       System.out.println("untaxable subtotal: $"+inv.getUntaxable());
       System.out.println("tax: $"+inv.payTax());
       System.out.println("Grand total: $"+(inv.getTaxable()+inv.payTax()+inv.getUntaxable()));
       sc.close();
	}
}
