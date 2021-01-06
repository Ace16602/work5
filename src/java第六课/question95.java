package javaµÚÁù¿Î;
import java.util.GregorianCalendar;
public class question95 {

	public static void main(String[] args) {
		GregorianCalendar GRE=new GregorianCalendar();
		System.out.println(GRE.get(GRE.MONTH));
		System.out.println(GRE.get(GRE.YEAR));
		System.out.println(GRE.get(GRE.DAY_OF_MONTH));
		
		GRE.setTimeInMillis(1234567898765L);
		System.out.println(GRE.get(GRE.MONTH));
		System.out.println(GRE.get(GRE.YEAR));
		System.out.println(GRE.get(GRE.DAY_OF_MONTH));
	}

}
