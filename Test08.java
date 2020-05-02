package Test;
class Student{
	String name;
	int age;
	public Student() {
		
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println("这名学生叫"+name+",今年"+age+"岁");
	}
}
class Undergraduate extends Student{
	String degree;
	public Undergraduate(String name,int age,String degree) {
		this.name=name;
		this.age=age;
		this.degree=degree;
	}
	public void show() {
		System.out.println(name+"今年"+age+"岁,是一名"+degree);
	}
}

public class Test08 {
	public static void main(String[] args) {
		Student s=new Student("陈钰",20);
		s.show();
		Undergraduate u=new Undergraduate("陈宇",25,"硕士");
		u.show();
	}

}
