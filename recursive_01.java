import java.util.Scanner;
import java.util.Random;
public class recursive_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int num=ran.nextInt(1000)+1;
		System.out.println("�ӫ~����"+num+"��");
		System.out.println(fun1(num));
		
	}
	public static String fun1(int num){
		int money = 1000-num;
		System.out.println("�ѤU"+money+"��");
		int aa[]={500,100,50,10,5,1};
		int b[]=new int[aa.length];
		for (int i=0;i<aa.length;i++){
			b[i]=money/aa[i];
			money=money%aa[i];
			System.out.println("��^"+b[i]+"��"+aa[i]+"��");
		}
		return "";
	}

}
