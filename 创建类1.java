package all12;
import java.util.Scanner;
public class Bohemian1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的选项：");
		System.out.println("1、计算长方体的体积;2、计算圆柱体的体积；3、计算圆锥体的体积");
		System.out.println("4、计算球体的体积;0、退出系统！");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("请输入长方体的长宽和高：");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			changFangTi( x, y,z);
			break;
		case 2:
			System.out.println("请输入圆柱体的半径和高：");
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			yuanZhuTi(x1,y1);
			break;
		case 3:
			System.out.println("请输入圆锥体的半径和高：");
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			yuanZhuTi(x2,y2);
			break;
		case 4:
			System.out.println("请输入球体的半径：");
			double x3=sc.nextDouble();
			qiuTi(x3);
			break;
		case 0:
			System.out.println("系统已退出，感谢使用！");
			break;
		}
	}
	public static int changFangTi(int a,int b,int c) {
		int d=a*b*c;
		System.out.println("这个长方体的体积是："+d);
		return d;
	}
	public static double yuanZhuTi(double r,double h) {
		double d=3.14*r*r*h;
		System.out.println("这个圆柱的体积是："+d);
		return d;
	}
	public static double yuanZhuiTi(double r,double h) {
		double d=(3.14*r*r*h)/3;
		System.out.println("这个圆锥的体积是："+d);
		return d;
	}
	public static double qiuTi(double r) {
		double d=(3.14*r*r*r)*4/3;
		System.out.println("这个球体的体积是："+d);
		return d;
	}
}
