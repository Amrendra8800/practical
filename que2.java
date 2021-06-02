class area1{
    int x,y,z;
    area1(int x){
        this.x = x;
        System.out.println("Area of square is = "+x*x);
    }
    area1(int x,int y){
        this.x=x;
        this.y = y;
        System.out.println("Area of rectangle is = "+x*y);
    }
    area1(int x,int y,int z){
        this.x=x;
        this.y = y;
        this.z= z;
        float s = (x+y+z)/2;
        float a = (float)Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("Area of triangle is = "+ a);
    } 
}
public class que2{
    public static void main(String[] args) {
        area1 square = new area1(2);
        area1 Rectangle = new area1(2,3);
        area1 triangle = new area1(12,13,10);
        }
}