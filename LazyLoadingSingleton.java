package SingletonDesign;  
  
class Singleton {  
    // Lazy Loading Singleton  
    //rule 2.2  
    private static Singleton obj;  
  
    // rule 2.1  
    private Singleton() {  
  
    }  
  
    //rule 2.3  
    public static Singleton getInstance() {  
        if (obj == null) {  
            obj = new Singleton();  
        }  
        return obj;  
    }  
}  
public class LazyLoadingSingleton {  
    public static void main(String[] args) {  
        Singleton c1 = Singleton.getInstance();  
    }  
}