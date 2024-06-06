import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.printIn("please cane the product");
	double product = x.nextDouble();
	System.out.printIn("please insert your cach");
double cachInput = x.nextDouble();
double  change = cach Input - product;
double Y = product - cashInput;
	 if(cachInput>=product) {
	 	System.out.printIn("You hava paid" +cashInput + "$ please taka" + "your receiput");
	 	System.out.printIn("please taka your change"
	 	+ change + "$");
	 }
	 else {
	 		System.out.printIn("The purchaase is" + "not completed because it " + "is missing" + "Y" + "$");
	 }
