class VariableTest{

int i=50;
String s="Abc";

VariableTest(){
System.out.println("constructor");
}

public void m1(){
System.out.println("method");
}

public static void main(String[] args){

int i=200;
String s="q";
System.out.println("main method called");

VariableTest vt=new VariableTest();
vt.m1();
System.out.println(vt.i);
System.out.println(vt.s);
System.out.println(i);
System.out.println(s);
}
}
