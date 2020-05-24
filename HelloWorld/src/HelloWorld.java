import java.util.Random;

//using namespace std;
public class HelloWorld {
	
	public static void main (String[] asf) {
	for(int i=0;i<100;i++) {
		Random rand = new Random();
		int n = rand.nextInt(6);
	
	if(n>5) {
		System.out.println(n);
	}
}
}
}