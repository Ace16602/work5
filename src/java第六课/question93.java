package javaµÚÁù¿Î;
import java.util.Date;

public class question93 {
	public static void main(String[] args) {
		long l=10000;
		
		
		for(int i=0;i<=8;i++) {
		Date date=new Date(l);
		toString(l,date);
		l*=10;
		}
	}
	public static void toString(long l,Date date) {
		System.out.println(l+":"+date.toString());
	}
}
