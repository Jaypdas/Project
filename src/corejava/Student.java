package corejava;

public class Student {
	
	
	static String cname="Driems";
	int sno;
	String sname;
	
	Student(String sname,int sno){
		this.sno=sno;
		this.sname=sname;
		
		
		}
	
	public static void main(String[] args) {
	
		Student s1=new Student("JP",100);//object creation
		Student s2=new Student("Vky",101);
		Student s3=new Student("Mky",102);
		System.out.println(s1.sno);
		System.out.println(s1.sname);
		System.out.println(s1.cname);                                                               
		System.out.println(s2.sno);
		System.out.println(s2.sname);
		System.out.println(s2.cname);
		System.out.println(s3.sno);
		System.out.println(s3.sname);
		System.out.println(s3.cname);
		

	}

}
