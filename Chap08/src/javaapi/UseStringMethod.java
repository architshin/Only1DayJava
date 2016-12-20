package javaapi;

public class UseStringMethod {
	public static void main(String[] args) {
		String csvStr = "Java,PHP,Ruby,C#,Python";
		String[] csvArray = csvStr.split(",");

		for(String element : csvArray) {
			System.out.println(element);
		}
	}
}
