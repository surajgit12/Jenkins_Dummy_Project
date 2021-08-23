
public class Test1 {

	
	Test1(){
		System.out.println("Hello Word");
	}
	
	Test1(int a ,int b){
	
		System.out.println("Multiple--->"+ a*b);
	}
	public static void main(String[] args) {
		
		new Test1();
		new Test1(10,5);


	}

}
