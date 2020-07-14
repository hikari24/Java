class Main {
	public static void main(String args[]) {
	

	hello("sato");

	int number = 10;
	System.out.println(number);

	String name = "sato";
	System.out.println(name);

	int i = 1;
	while(i <= 5) {
		System.out.println(i);
		i++;
	}

	Person person1 = new Person("松山", "ひかり");

	System.out.println(person1.firstName);
	System.out.println(person1.lastName);
	
	}

	public static void hello(String name) {
		System.out.println("こんにちは" + name);
	}

}