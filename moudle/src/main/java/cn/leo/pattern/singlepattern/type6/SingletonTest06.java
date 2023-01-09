package cn.leo.pattern.singlepattern.type6;


/**
 * 双层判断 懒汉式 线程安全 可使用
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }

}

// 懒汉式(线程安全，同步方法)
class Singleton {

    //增加volatile关键字，能让修改的值立刻更新到主内存，同时让线程之间可见；
    private static volatile Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用

    public static Singleton getInstance() {
        //第一层 ，不为null 直接返回
        if (instance == null) {
            //方法中增加一把轻量级锁，避免多个线程通过第一层的null判断，同步代码块
            synchronized (Singleton.class) {
                //通过锁后还是null才创建对象，否则直接返回；
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}