package java第六课;
import java.util.Date;
import java.util.*;
import java.util.Scanner; //读入包
import javax.print.StreamPrintService;
import java.math.BigInteger; //math中的大数包
import java.math.*;
import java.lang.String;
import java.util.Random;
	class StopWatch {
		private Date startTime;
		private Date endTime;
		public StopWatch() {
			startTime=new Date();
		}
		public  void start(){
			startTime=new Date();
		}
		public  void stop() {
			endTime=new Date();
		}
		public Date getstartTime() {
			return startTime;
		}
		public Date getendTime() {
			return endTime;
		}
		public long getElapsedTime() {
			return endTime.getTime() - startTime.getTime();
		}
	}
public class question96 {	
	public static void main(String[] args) {
		int NUM=10000;
		int MIN=0;
		Random Ran = new Random(10000);
		int[] NUMBER=new int [NUM];
		int[] FOLLOW=new int [NUM];
		for(int j=0;j<=NUM-1;j++) {
			NUMBER[j]=Ran.nextInt();
		}
		StopWatch watch = new StopWatch();
		for(int i=0;i<=NUM-1;i++) {
			for(int j=i+1;j<=NUM-1;j++) {
				if(NUMBER[j]<=MIN) {
						MIN=NUMBER[j];
				}
			}
			FOLLOW[i]=MIN;
		}
		watch.stop();
		System.out.println(watch.getElapsedTime());
	}
}