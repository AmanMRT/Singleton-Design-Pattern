package SingletonDesign;  
  
class Singleton {  
    private static Singleton obj;  
  
    private Singleton() {  
  
    }  
  
    public static synchronized Singleton getInstance() //check  
    {  
        if (obj == null) {  
            obj = new Singleton();  
        }  
        return obj;  
    }  
}  
  
public class SynchronizedThreadLazyLoading {  
    public static void main(String[] args) {  
        Thread t1 = new Thread(new Runnable() {  
            public void run() {  
                Singleton c1 = Singleton.getInstance();  
            }  
        });  
  
        Thread t2 = new Thread(new Runnable() {  
            public void run() {  
                Singleton c1 = Singleton.getInstance();  
            }  
        });  
  
        t1.start();  
        t2.start();  
    }  
}  