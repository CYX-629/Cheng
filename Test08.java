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
		System.out.println("����ѧ����"+name+",����"+age+"��");
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
		System.out.println(name+"����"+age+"��,��һ��"+degree);
	}
}

public class Test08 {
	public static void main(String[] args) {
		Student s=new Student("����",20);
		s.show();
		Undergraduate u=new Undergraduate("����",25,"˶ʿ");
		u.show();
	}

}
