public class Trans {
    public static void main(String[] args){
        A a = new B(); //B对象上转型
        a.n = 0.618; //操作子类隐藏对象
        a.m = 200; //操作子类继承对象
        a.f(); //调用子类继承方法

        // 如果子类重写了父类的某个方法后，对象的上
        // 转型对象调用这个方法时，一定是调用了这个
        // 重写的方法
        a.g(); //调用子类重写方法

        // 上转型对象不能操作子类声明定义的成员变量
        // （失掉了一些属性），不能使用子类声明定义
        // 的方法（失掉了一些功能）
        //a.cry(); 非法调用


        B b = (B)a;  //强制转换

        // 上转型对象可以操作子类继承的成员变量和隐
        // 藏的成员变量，也可以使用子类继承的或重写
        // 的方法
        b.cry(); //正常调用
        }
}

class A{
    double n;
    int m;
    void f(){}
    void g(){}
}
class B extends A{
    int n=12; //隐藏了A中n
    void g(){}//重写了A中g()
    void cry(){} //新增方法
}
