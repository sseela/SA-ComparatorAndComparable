import java.util.Comparator;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		//TreeSet t = new TreeSet<>();
		//TreeSet t = new TreeSet<>(new MyComparator());
		TreeSet t = new TreeSet<>(new intComparator());
		CorpEmployee e1 = new CorpEmployee(100, "sand", "hyd");
		CorpEmployee e2 = new CorpEmployee(200, "mun", "bang");
		CorpEmployee e3 = new CorpEmployee(300, "seenu", "mum");
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);

	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		CorpEmployee emp1=(CorpEmployee)o1;
		CorpEmployee emp2=(CorpEmployee)o2;
		String str1 = emp1.getName();
		String str2 = emp2.getName();
		return str1.compareTo(str2);
	}
	
}

class intComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		CorpEmployee e1=(CorpEmployee)o1;
		CorpEmployee e2=(CorpEmployee)o2;
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		return id2.compareTo(id1);
	}
	
}

interface Interface1{
	public int work();
	default void m1() {
		System.out.println("Interface 1 method");
	}
}

interface Interface2{
	public int work();
	/*default void m1() {
		System.out.println("Interface 2 method");
	}*/
}

//main intention of default methods is to enhance interface functionality without disturbing its implementation classes(Collection). 
//default methods need not be overidden in implementation class
//But when there is same method present in different interfaces, then in the class that implements both interfaces, we should override in imp class. 
class TestForDefault implements Interface1, Interface2{
	/*public void m1() {
		System.out.println("main method m1");
	}*/
	public static void main(String[] args) {
		TestForDefault t = new TestForDefault();
		t.m1();
	}
	@Override
	public int work() {
		return 0;
	}
}

interface IntForStatic{
	public static void m1() {
		System.out.println("interface static method");
	}
}
class TestForStat implements IntForStatic {
	public static void main(String[] args) {
		IntForStatic.m1();
	}
	
	
	
	
}

