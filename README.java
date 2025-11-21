class a{
    public static void main(String[]args){
        e u1=new u();
        e i1=new i();
        u1.show();
        i1.show();
    }
}
abstract class e{
    abstract void show();
}
class u extends e{
    void show(){
        System.out.println("あ");
    }
}
class i extends e{
    void show(){
        System.out.println("い");
    }
}