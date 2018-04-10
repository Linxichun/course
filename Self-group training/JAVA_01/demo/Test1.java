public class Test1{	// 表示声明一个”类“，并且类的名字为：Test1（注意：类名要与文件名相同）；
	public static void main(String args[]){	//  固定的写法，表示一个主方法（方法名：”main“），为程序的运行入口
		System.out.println("我的第一JAVA程序！！！");	// 输出语句，表示程序运行时，在控制台输出引号内的话；
		
		for (int i=0; i<args.length; i++) {
			System.out.println("第"+(i+1)+"个参数值："+args[i]);
		}
	}
	
}