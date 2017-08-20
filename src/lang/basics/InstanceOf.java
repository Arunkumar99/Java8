
public class InstanceOf {
	public static void main(String[] args)
	{
		parent obj1=new parent();
		child obj2=new child();
		System.out.println("obj1 is instance of parent="+(obj1 instanceof parent));
		System.out.println("obj1 is instance of child="+(obj1 instanceof child));
		System.out.println("obj1 instance of myinterface="+(obj1 instanceof MyInterface));
		System.out.println("obj2 is instance of parent="+(obj2 instanceof parent));
		System.out.println("obj2 is instance of child="+(obj2 instanceof child));
		System.out.println("obj2 instance of myinterface="+(obj2 instanceof MyInterface));
	}

}
class parent{}
class child extends parent implements MyInterface{}
interface MyInterface{}