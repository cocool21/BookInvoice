
public class Invoice {
private double taxable=0;
private double untaxable=0;
private double taxRate=0.05;
private double tax=0;
public Invoice(){
	
}
public void getInvoice(double value,String untax){
		if(untax.toLowerCase().equals("y")){
			Untaxable(value);
		}else if(untax.toLowerCase().equals("n")){
			Taxable(value);
		}
		
}
public void Taxable(double value){
	taxable+=value;
}
public double getTaxable(){
	return taxable;
}
public void Untaxable(double value){
	untaxable+=value;
}
public double getUntaxable(){
	return untaxable;
}
public double payTax(){
	tax=taxRate*taxable;
	return tax;
}
}