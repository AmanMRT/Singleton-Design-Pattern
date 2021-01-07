package SingletonDesign;  
  
enum Singleton {  
    INSTANCE; //inbuilt private constructor  
    int x;  
    public void show() {  
        System.out.println(x);  
    }  
}  
  
public class EnumwithSingleton {  
    public static void main(String[] args) {  
        Singleton object1 = Singleton.INSTANCE;  
        object1.x = 10;  
        object1.show();  
  
        Singleton object2 = Singleton.INSTANCE;  
        object2.x = 20;  
        object1.show();  
    }  
} 