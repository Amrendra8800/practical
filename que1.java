class que1
{
    int id;
    String name;
    que1(int i,String n){
        this.id = i;
        this.name= n;
    }
    que1(que1 s){
        this.id = s.id;
        this.name = s.name;
    }
    void display(){
        System.out.println(id+"  "+name);
    }
    public static void main(String[] args) {
        que1 s1 = new que1(1, "Amrendra");
        que1 s2 = new que1(s1);
        s1.display();
        s2.display();
    }
}