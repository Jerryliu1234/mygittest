package javastudy3;

public class OuterClass {
    private static String outerName;
    public  int age;

    static class InnerClass1{
        /* �ھ�̬�ڲ����п��Դ��ھ�̬��Ա */
        public static String _innerName = "static variable";
        public void display(){
            /*
             * ��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա�����ͷ���
             * ���ܷ����ⲿ��ķǾ�̬��Ա�����ͷ���
             */
            System.out.println("OutClass name :" + outerName);
        }
    }
    class InnerClass2{
        /* �Ǿ�̬�ڲ����в��ܴ��ھ�̬��Ա */
        public String _innerName = "no static variable";
        /* �Ǿ�̬�ڲ����п��Ե����ⲿ����κγ�Ա,�����Ǿ�̬�Ļ��ǷǾ�̬�� */
        public void display(){
            System.out.println("OuterClass name��" + outerName);
            System.out.println("OuterClass age��" + age);
        }
    }
    public static void main(String[] args) {
    	/* �ⲿ����ֱ�ӷ��ʾ�̬�ڲ��ྲ̬Ԫ�� */
        System.out.println(InnerClass1._innerName);
        /* ��̬�ڲ������ֱ�Ӵ���ʵ������Ҫ�������ⲿ�� */
        new InnerClass1().display();
        /* �Ǿ�̬�ڲ��Ĵ�����Ҫ�������ⲿ�� */
        OuterClass.InnerClass2 inner2 = new OuterClass().new InnerClass2();
        /* �Ǿ�̬�ڲ���ĳ�Ա��Ҫʹ�÷Ǿ�̬�ڲ����ʵ������ */
        System.out.println(inner2._innerName);
        inner2.display();;
    }
}
