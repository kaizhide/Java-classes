package all12;
import java.util.Scanner;
public class Bohemian1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ѡ�");
		System.out.println("1�����㳤��������;2������Բ����������3������Բ׶������");
		System.out.println("4��������������;0���˳�ϵͳ��");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("�����볤����ĳ���͸ߣ�");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			changFangTi( x, y,z);
			break;
		case 2:
			System.out.println("������Բ����İ뾶�͸ߣ�");
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			yuanZhuTi(x1,y1);
			break;
		case 3:
			System.out.println("������Բ׶��İ뾶�͸ߣ�");
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			yuanZhuTi(x2,y2);
			break;
		case 4:
			System.out.println("����������İ뾶��");
			double x3=sc.nextDouble();
			qiuTi(x3);
			break;
		case 0:
			System.out.println("ϵͳ���˳�����лʹ�ã�");
			break;
		}
	}
	public static int changFangTi(int a,int b,int c) {
		int d=a*b*c;
		System.out.println("��������������ǣ�"+d);
		return d;
	}
	public static double yuanZhuTi(double r,double h) {
		double d=3.14*r*r*h;
		System.out.println("���Բ��������ǣ�"+d);
		return d;
	}
	public static double yuanZhuiTi(double r,double h) {
		double d=(3.14*r*r*h)/3;
		System.out.println("���Բ׶������ǣ�"+d);
		return d;
	}
	public static double qiuTi(double r) {
		double d=(3.14*r*r*r)*4/3;
		System.out.println("������������ǣ�"+d);
		return d;
	}
}
