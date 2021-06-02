public class static1 {
   
    static void myStaticMethod() {
      System.out.println("Static methods can be called without creating objects");
    }
  
    // Public method
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
  
    // static method
    public static void main(String[ ] args) {
      myStaticMethod(); 
  
      static1 myObj = new static1(); 
      myObj.myPublicMethod();
    }
  }