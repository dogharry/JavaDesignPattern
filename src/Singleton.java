public class Singleton {
    //首先将实例赋值为null，延迟加载（类使用时才进行加载，否则不会被加载）
    private static Singleton instance=null;

    //私有实例变量，防止被外部实例化
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance!=null){
            return instance;
        }
        else{
            return new Singleton();
        }
    }
    public static void main(String args []){
        Singleton dino=Singleton.getInstance();
        System.out.print(dino.getClass().getName());
    }
}

//优点：延迟加载（需要的时候才去加载）,适合单线程操作
//缺点：线程不安全，在多线程中很容易出现不同步的情况，如在数据库对象进行的频繁读写操作时。