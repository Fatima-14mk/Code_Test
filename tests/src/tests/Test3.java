package tests;

public class Test3 { 
	 public static void main(String[] args) { 
	 A a1 = new A(); 
	 A b=new B(); 
	 a1.init(); 
	 System.out.println(b.p); 
	 System.out.println(b.a); 
	 System.out.println(b.f(a1)); 
	 System.out.println(b.g()); 
	 } 
	} 
	class A{ 
	 public void init(){ p=0; a=0; b=0; c=0; } 
	 public int p = 1; 
	 static int a=2; 
	 protected int b = 3; 
	 private int c = 4; 
	 int f(A objetA){ return a; } 
	 int g(){ return f(new A())+ p+b+c; } 
	 public int getC(){ return c; } 
	 public void setC(int c) { this.c = c; } 
	} 
	class B extends A{ 
	 public int p = 10; 
	 int a=11; 
	 protected int b = 12; 
	 private int c = 13; 
	 int f(B objetB){ return super.f(new B())+a; } 
	 int g(){ setC(19); return f(new A())+ p+b+getC(); } 
	 public int getC(){ return super.getC(); } 
	 public void setC(int c) { this.c = c; }}