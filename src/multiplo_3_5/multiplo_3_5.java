package multiplo_3_5;

public class multiplo_3_5 {
	public static void main(String[] args) {
		int i;
		for (i=1;i<=20;i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				i+=i;
			}
		}System.out.printf("A soma dos multiplos de I de 1 até 20 é %d",i);
	}
}
