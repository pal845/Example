class VariableTest{


int gi=50;
String gs="Xyz";
int pqr;


public VariableTest(){

System.out.println("Constructor called!!");

}


public void m1(){

System.out.println("m1 Method called");

int i2=22;
System.out.println(i2);

VariableTest  vt =new VariableTest();
System.out.println(vt.gi);

}



public static void main(String [] args){


System.out.println("main method started!!");

int abc;
abc=78;
abc=45;
System.out.println(abc);


VariableTest  vt =new VariableTest();
//VariableTest  vt1 =new VariableTest();


vt.m1();

int i=11;
String s="Abc";



System.out.println(i);
System.out.println(s);
//System.out.println(i2);

System.out.println(vt.gi);
System.out.println(vt.gs);

System.out.println(vt.pqr);


}


}