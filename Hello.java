public class Hello {
    public static void greet(String name) {
        System.out.println(greeting() + name);
    }
    public static String greeting() {
        return "Hello, ";
    }
public static void main(String[] args) {
	greet("Eve");
}
}