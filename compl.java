public class compl {
    double real,img;
    compl(double r, double i){
        this.real=r;
        this.img=i;
    }
    public static compl sum(compl c1,compl c2){
        compl temp = new compl(0,0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
     public static void main(String[] args) {
         compl c1 = new compl(2.2, 3.4);
         compl c2 = new compl(2.3, 3.3);
         compl add = sum(c1,c2);
         System.out.println("sum is "+ add.real+" + "+add.img+"i");
     }
}