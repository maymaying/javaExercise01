public class Course01 {
}
/*
1.
 class test {
    public static void main(String args[]) {
        int x,y;
        x=5>>2;//x=1
        y=x>>>2;//移位运算符（>>>），它使用了“零扩展”：无论正负，都在高位插入0。这一运算符是C 或C++没有的。
        System.out.println(y);
    }
}

2.
 class foo {
    public static void main(String sgf[]) {
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);
    }
    static void operate(StringBuffer x,StringBuffer y) {
        x.append(y);
        y=x;
    }
}

3.
public static void main(String args[])throws InterruptedException{
        Thread t=new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("2");
            }
        });
        t.start();
        t.join();
        System.out.print("1");
    }

4.
class Example{
    String str=new String("good");
    char[]ch={'a','b','c'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
//引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
    }
}
*/
class HelloA{
    public HelloA()
    {
        System.out.println("I’m A class ");
    }
    static
    {
        System.out.println("static A");
    }
}
public class HelloB extends HelloA{
    public HelloB()
    {
        System.out.println("I’m B class");
    }
    static{
        System.out.println("static B");
    }
    public static void main (String[] args){
        new HelloB();
    }
}
