public class Helloworld {

	public static void main(String[] args) {
	hello("world");
	hello("user");
	hello("Luda");
	Square s= new Square(5.0);

		System.out.println("Площадь квадрата со стороной " + s.l + "= " + s.area());
	Rectangle r= new Rectangle(4,6);

		System.out.println("Площадь прямоуголльника со сторонами " + r.a + " и " + r.b + "= " + r.area());
	}
	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}
}