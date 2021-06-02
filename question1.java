class student1{
    String name;
    int marks;
    student1(String n,int m){
        this.name = n;
        this.marks = m;
    }
    
}
public class question1{
    public static void main(String[] args) {
        student1 s1 = new student1("Amrendra",80);
        student1 s2 = new student1("Ankit",89);
        System.out.println("Name : "+s1.name+" and marks is : "+s1.marks);
        System.out.println("Name : "+s2.name+" and marks is : "+s2.marks);
        if(s1.marks>s2.marks){
            System.out.println("marks of "+s1.name+" is higher than "+s2.name);
        }
        else{
            System.out.println("marks of "+s2.name+" is higher than "+s1.name);
        }
    }
}