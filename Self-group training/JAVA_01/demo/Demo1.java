public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A中width的值"+a.width);
    }
}

class A{
    public static int width=100; //静态变量，静态域 field
    static{
        System.out.println("静态初始化类A");
        width = 300 ;
    }
    public A() {
        System.out.println("创建A类的对象");
    }

}