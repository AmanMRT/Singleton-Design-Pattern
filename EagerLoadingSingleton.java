package SingletonDesign;  
  
class Singleton {  
    //Eager Loading Singleton object  
    //rule 1.2  
    private static Singleton obj = null;  
  
    // rule 1.1  
    private Singleton() {  
        //rule 1.3  
        obj = new Singleton();  
    }  
  
    //rule 1.4  
    public static Singleton getInstance() {  
        return obj;  
    }  
}  
public class EagerLoadingSingleton {  
    public static void main(String[] args) {  
        Singleton c1 = Singleton.getInstance();  
        Singleton c2 = Singleton.getInstance();  
        
    }  
}  