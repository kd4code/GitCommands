package GitCommand;
//Student Change in Local repository
//Student 2nd Change from Remote Repository
public class Student {
	
	int id;
	String name;
	int m1,m2,m3;
	
	
	public Student() {
		super();
	}

	public Student(int id, String name, int m1, int m2, int m3) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public void sumMarks(Student s1)
	{
	  	int sum=s1.m1+s1.m2+s1.m3;
	  	System.out.println("Total Marks of "+s1.name +" is "+sum);
	}
	
    public static void main(String[] args) {
		Student s1=new Student(10,"Ram",90,90,90);
        s1.sumMarks(s1);
		
	}
}


