package hello;
import java.util.Scanner;
public class Java_Practice {

 Java_Practice() {
	System.out.println("Hello,Mr.Perfectly Fine");
}
 Java_Practice(int a,int b){
	 if(a<b) {
		 System.out.println("Today is a great day");
	 }
 }
 Java_Practice(float a,float b,float c){
	 System.out.println("All floats");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Java_Practice obj1=new Java_Practice();
      Java_Practice obj2=new Java_Practice(4,5);
      Java_Practice obj3=new Java_Practice(1.0f,8.0f,9.0f);
      
	}

}
