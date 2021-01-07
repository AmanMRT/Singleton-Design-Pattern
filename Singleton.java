//package SingletonDesign;
//
///*RULES
// * 1) Eager Loading Singleton
// 	* 1.1-> Default constructor as private.
// 	* 1.2-> create private static class type variable and initialise with null.
// 	* 1.3-> Initialise variable(in step 2) to Constructor of class type(here Singleton).
// 	* 1.4-> create public static getObject or getInstance method and return class object(here obj).
// * 
// * 2) Lazy Loading singleton
// 	* 2.1-> Default constructor as private.
// 	* 2.2-> Create private static class type variable and initialise with null.  
// 	* 2.3-> create public static getObject or getInstance method with condition.
//*/
//
//public class Singleton 
//{
//	/*
//	//Eager Loading Singleton
//	 * 
//	//rule 1.2
//	private static Singleton obj = null;
//	
//	// rule 1.1
//	private Singleton() 
//	{
//		//rule 1.3
//		obj = new Singleton();
//	}
//	
//	//rule 1.4
//	public static Singleton getObject()
//	{ 
//		return obj;
//	}
//	*/
//	
//	// Lazy Loading Singleton
//	//rule 2.2
//	private static Singleton obj = null;
////	
////	// rule 2.1
//	private Singleton() 
//	{
//		
//	}
//	
//	//rule 2.3
//	public static Singleton getObject()
//	{ 
//		if(obj == null)
//		{
//			obj = new Singleton();
//		}
//		return obj;
//	}
//}
