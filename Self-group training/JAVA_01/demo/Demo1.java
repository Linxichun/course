public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A��width��ֵ"+a.width);
    }
}

class A{
    public static int width=100; //��̬��������̬�� field
    static{
        System.out.println("��̬��ʼ����A");
        width = 300 ;
    }
    public A() {
        System.out.println("����A��Ķ���");
    }

}