class AllBlock{
AllBlock(){
System.out.println("constructor");
}

public static void main(String[] args){
System.out.println("HIII");
AllBlock a1=new AllBlock();
AllBlock a2=new AllBlock();

a1.m1();
a1.m2();
}
public void m1(){
System.out.println("good&&");
}
public void m2(){
System.out.println("ok!!");

}
}